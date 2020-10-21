#include<iostream>
#include<stack>
#include<string>
#include<algorithm>
using namespace std; 
    stack<char>st;
   // stack<char>s2;
    string removeDuplicates(string S) {
        int len=S.length();
     
        for(auto i:S)
        {
            if(st.empty())
                st.push(i);
            else
            {
                if(st.top()==i)
                    st.pop();
                else
                    st.push(i);
            }  
        }
        string result="";
        while(!st.empty())
        {
            result+=st.top();
            st.pop();
        }
        reverse(result.begin(),result.end());
        return result;
    }
    int main()
    {
        string s="abbabbaca";
        string result=removeDuplicates(s);
        cout<<result;
    }
    