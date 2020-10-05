#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
        map<char, int> frq;
        for(char c:s){
            frq[c]++;
        }
        int sum = 0;
        bool fg = false;
        for(auto x: frq) {
            if(x.second%2==0) {
                sum += x.second;
            }
            else {
                if(fg)
                    sum += (x.second-1);
                else {
                    fg = true;
                    sum += x.second;
                }
            }
        }
        return sum;
    }
};

int main() {
    string s;
    cin>>s;
    Solution obj;
    cout<<obj.longestPalindrome(s)<<endl;
    return 0;
}