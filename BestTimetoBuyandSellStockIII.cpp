class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        if(n==0) return 0;
        int mx=-1e6; int mn=1e6;
        int res=0; mn=min(mn, prices[0]);
        int dpFor[n]; int dpBack[n]; 
        dpFor[0]=0;
        for(int i=1; i<n; i++){
            mn=min(mn, prices[i]);
            int cur=prices[i]-mn;
            dpFor[i]=max(dpFor[i-1], cur);
            res=max(res, dpFor[i]);
        }	
        for(int i=n-1; i>=0; i--){
            mx=max(mx, prices[i]);
            dpBack[i]=mx;
   	    }
        for(int i=1; i<n-1; i++){
            int x=dpFor[i-1]-prices[i]+dpBack[i+1];
            res=max(res, x);
        }
        return res;
    }
};
