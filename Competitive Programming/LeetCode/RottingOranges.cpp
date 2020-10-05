#include <bits/stdc++.h>
using namespace std;

const int FRESH = 1 , EMPTY = 0, ROTTEN = 2;
class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) 
    {
        const int R = grid.size(), C = grid[0].size();
        int fresh = 0;
        queue<int> Q;
        for (int i = 0;  i < R; ++i)
            for (int j = 0; j < C; ++j)
                 {
                     if (grid[i][j] == FRESH) fresh++;
                     else if (grid[i][j] == ROTTEN) Q.push(i*C + j);
                 }
        if (fresh == 0) return 0;
        int fresh_to_rotten = 0;
        vector<pair<int, int>> dirs = {{0, 1},{0, -1},{1, 0},{-1, 0}};
        int ret = 0;
        while (!Q.empty())
        {
            ret++;
            int len = Q.size();
            for (int k = 0; k < len; ++k)
            {
                auto idx = Q.front(); Q.pop();
                int i = idx/C, j = idx % C;
                for (auto [di, dj] : dirs)
                {
                    auto r = i + di, c = j + dj;
                    if (r >=R || r < 0 || c>=C || c < 0)continue;
                    if (grid[r][c] != FRESH) continue;
                    grid[r][c] = ROTTEN;
                    Q.push(r*C + c);
                    fresh_to_rotten++;
                }  
            }
            if (fresh_to_rotten == fresh) return ret;
        }
        return -1;
    }
};

int main() {
    int n;
    cin>>n;
    vector<vector<int> > v(n, vector<int>(n));
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++)
            cin>>v[i][j];
    }
    Solution obj;
    cout<<obj.orangesRotting(v)<<endl;
    return 0;
}