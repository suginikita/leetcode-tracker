// Last updated: 8/5/2026, 2:23:47 PM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length()) return "";
4
5        int[] count = new int[128];
6
7        for (char c : t.toCharArray()) {
8            count[c]++;
9        }
10
11        int left = 0, right = 0;
12        int required = t.length();
13        int minLen = Integer.MAX_VALUE;
14        int start = 0;
15
16        while (right < s.length()) {
17            char c = s.charAt(right);
18
19            if (count[c] > 0) {
20                required--;
21            }
22            count[c]--;
23            right++;
24
25            while (required == 0) {
26                if (right - left < minLen) {
27                    minLen = right - left;
28                    start = left;
29                }
30
31                char lc = s.charAt(left);
32                count[lc]++;
33
34                if (count[lc] > 0) {
35                    required++;
36                }
37                left++;
38            }
39        }
40
41        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
42    }
43}