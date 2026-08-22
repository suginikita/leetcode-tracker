// Last updated: 8/22/2026, 9:04:57 AM
1class Solution {
2    
3    Map<String, Boolean> memo = new HashMap<>();
4    
5    public boolean isScramble(String s1, String s2) {
6        
7        if (s1.equals(s2)) {
8            return true;
9        }
10        
11        if (s1.length() != s2.length()) {
12            return false;
13        }
14        
15        String key = s1 + "#" + s2;
16        
17        if (memo.containsKey(key)) {
18            return memo.get(key);
19        }
20        int[] count = new int[26];
21        
22        for (int i = 0; i < s1.length(); i++) {
23            count[s1.charAt(i) - 'a']++;
24            count[s2.charAt(i) - 'a']--;
25        }
26        
27        for (int num : count) {
28            if (num != 0) {
29                memo.put(key, false);
30                return false;
31            }
32        }
33        
34        int n = s1.length();
35        
36        for (int i = 1; i < n; i++) {
37            boolean noSwap =
38                    isScramble(s1.substring(0, i), s2.substring(0, i))
39                    &&
40                    isScramble(s1.substring(i), s2.substring(i));
41            boolean swap =
42                    isScramble(s1.substring(0, i), s2.substring(n - i))
43                    &&
44                    isScramble(s1.substring(i), s2.substring(0, n - i));
45            
46            if (noSwap || swap) {
47                memo.put(key, true);
48                return true;
49            }
50        }
51        
52        memo.put(key, false);
53        return false;
54    }
55}