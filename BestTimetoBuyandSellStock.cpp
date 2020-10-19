class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int mx=0; int mn=INT_MAX;
        for(auto x:prices){
            if(x<mn) mn=x;
            mx=max(mx, x-mn);
        }
        return mx;
    }
};
