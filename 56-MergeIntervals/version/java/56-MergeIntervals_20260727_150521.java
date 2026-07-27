// Last updated: 7/27/2026, 3:05:21 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[][] dp = new int[m][n];
7
8        dp[0][0] = grid[0][0];
9        for (int j = 1; j < n; j++) {
10            dp[0][j] = dp[0][j - 1] + grid[0][j];
11        }
12        for (int i = 1; i < m; i++) {
13            dp[i][0] = dp[i - 1][0] + grid[i][0];
14        }
15
16        // Fill remaining cells
17        for (int i = 1; i < m; i++) {
18            for (int j = 1; j < n; j++) {
19                dp[i][j] = grid[i][j] +
20                           Math.min(dp[i - 1][j], dp[i][j - 1]);
21            }
22        }
23
24        return dp[m - 1][n - 1];
25    }
26}