// Last updated: 7/27/2026, 3:03:25 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5
6        if (obstacleGrid[0][0] == 1)
7            return 0;
8
9        int[][] dp = new int[m][n];
10        dp[0][0] = 1;
11
12        for (int i = 0; i < m; i++) {
13            for (int j = 0; j < n; j++) {
14
15                if (obstacleGrid[i][j] == 1) {
16                    dp[i][j] = 0;
17                } else {
18                    if (i > 0)
19                        dp[i][j] += dp[i - 1][j];
20                    if (j > 0)
21                        dp[i][j] += dp[i][j - 1];
22                }
23            }
24        }
25
26        return dp[m - 1][n - 1];
27    }
28}