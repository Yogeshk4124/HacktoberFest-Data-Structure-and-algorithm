#include<iostream>
#include<vector>
#include<algorithm>
#include<list>
#include<stack>
#include<unordered_map>
using namespace std;
    stack<char>s1;
    stack<char>s2;
    bool backspaceCompare(string S, string T) {
        int l1=S.length();
        int l2=T.length();
        int i=0,j=0;
        while(i<l1)
        {
            if(S[i]!='#')
                s1.push(S[i]);
            else
            {
               if(!s1.empty())
                s1.pop(); 
            }
                
            i++;
        }
        while(j<l2)
        {
            if(T[j]!='#')
                s2.push(T[j]);
            else
            {
               if(!s2.empty())
                s2.pop(); 
            }
                
            j++;
        }
        if(s1.empty() && s2.empty())
            return true;
        else if((s1.empty() && !s2.empty()) || (s2.empty() && !s1.empty()))
            return false;
        else
        {
            while(!s1.empty() && !s2.empty())
            {
                if(s1.top()!=s2.top())
                    return false;
                else
                {
                    s1.pop();
                    s2.pop();
                }
            }
            if((s1.empty() && !s2.empty()) || (s2.empty() && !s1.empty()))
                return false;
            else
                return true;
        }
    }
    int main()
    {
        string S="abc##de#";
        string T="##ab#d";
        bool result=backspaceCompare(S,T);
        cout<<result;

    }