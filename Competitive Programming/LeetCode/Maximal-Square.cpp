class Solution {
public:
    int maximalSquare(vector<vector<char>>& matrix) {
        
        if(matrix.empty())
            return 0;
        const int n = matrix.size();
        const int m = matrix[0].size();
        vector<vector<char>> v;
        char ans;
        v.resize(n);
        
        v[0] = matrix[0];
        ans = *max_element(v[0].begin(), v[0].end());
        
        for(int i=0; i<n;i++){
            v[i].resize(m);
            v[i][0] = matrix[i][0];
            if(v[i][0]>ans)
                ans = v[i][0];
        }
        
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j]=='0')
                    v[i][j] = '0';
                else
                    v[i][j] = 1 + min(v[i][j-1], min(v[i-1][j], v[i-1][j-1]) );
                if(v[i][j]>ans)
                    ans = v[i][j];
            }
        }
        ans-='0';
        return ans*ans;
    }
};
