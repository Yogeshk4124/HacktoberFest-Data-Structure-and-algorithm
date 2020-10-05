#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int titleToNumber(string s) {
        reverse(s.begin(), s.end());
        long long ans=0;
        for(int i=0; i<s.size(); i++) {
            ans += pow(26,i)*((s[i]-'A')+1);
        }
        return ans;
    }
};

int main() {
    string s;
    cin>>s;
    Solution obj;
    cout<<obj.titleToNumber(s)<<endl;
    return 0;
}