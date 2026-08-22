// Last updated: 8/22/2026, 9:14:21 AM
1class Solution {
2    public int numDecodings(String s) {
3        
4        if (s.charAt(0) == '0') {
5            return 0;
6        }
7        
8        int prev2 = 1;
9        int prev1 = 1;
10        
11        for (int i = 1; i < s.length(); i++) {
12            
13            int current = 0;
14            if (s.charAt(i) != '0') {
15                current += prev1;
16            }
17            int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));
18            
19            if (twoDigit >= 10 && twoDigit <= 26) {
20                current += prev2;
21            }
22            
23            prev2 = prev1;
24            prev1 = current;
25        }
26        
27        return prev1;
28    }
29}