// Last updated: 7/27/2026, 3:06:43 PM
1class Solution {
2    public boolean isNumber(String s) {
3
4        boolean seenDigit = false;
5        boolean seenDot = false;
6        boolean seenExponent = false;
7
8        for (int i = 0; i < s.length(); i++) {
9            char ch = s.charAt(i);
10
11            if (Character.isDigit(ch)) {
12                seenDigit = true;
13            }
14            else if (ch == '+' || ch == '-') {
15                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
16                    return false;
17
18            }
19            else if (ch == '.') {
20                if (seenDot || seenExponent)
21                    return false;
22
23                seenDot = true;
24            }
25            else if (ch == 'e' || ch == 'E') {
26                if (seenExponent || !seenDigit)
27                    return false;
28
29                seenExponent = true;
30                seenDigit = false;   // Need digits after exponent
31            }
32            else {
33                return false;
34            }
35        }
36
37        return seenDigit;
38    }
39}