// Last updated: 7/27/2026, 2:58:13 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int i = s.length() - 1;
4        int count = 0;
5        while (i >= 0 && s.charAt(i) == ' ') {
6            i--;
7        }
8        while (i >= 0 && s.charAt(i) != ' ') {
9            count++;
10            i--;
11        }
12
13        return count;
14    }
15}