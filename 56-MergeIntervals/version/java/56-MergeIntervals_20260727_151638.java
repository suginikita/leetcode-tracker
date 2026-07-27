// Last updated: 7/27/2026, 3:16:38 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5
6        int[][] dp = new int[m + 1][n + 1];
7        for (int i = 0; i <= m; i++) {
8            dp[i][0] = i;
9        }
10
11        for (int j = 0; j <= n; j++) {
12            dp[0][j] = j;
13        }
14        for (int i = 1; i <= m; i++) {
15            for (int j = 1; j <= n; j++) {
16
17                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
18                    dp[i][j] = dp[i - 1][j - 1];
19                } else {
20                    dp[i][j] = 1 + Math.min(
21                            dp[i - 1][j - 1],   // Replace
22                            Math.min(dp[i - 1][j], dp[i][j - 1]) // Delete, Insert
23                    );
24                }
25            }
26        }
27
28        return dp[m][n];
29    }
30}