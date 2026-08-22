// Last updated: 8/22/2026, 9:23:15 AM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3
4        if (s1.length() + s2.length() != s3.length()) {
5            return false;
6        }
7
8        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
9
10        dp[0][0] = true;
11
12        for (int i = 0; i <= s1.length(); i++) {
13            for (int j = 0; j <= s2.length(); j++) {
14
15                if (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
16                    dp[i][j] = dp[i][j] || dp[i - 1][j];
17                }
18
19                if (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
20                    dp[i][j] = dp[i][j] || dp[i][j - 1];
21                }
22            }
23        }
24
25        return dp[s1.length()][s2.length()];
26    }
27}