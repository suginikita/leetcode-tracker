// Last updated: 7/27/2026, 3:07:42 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3
4        for (int i = digits.length - 1; i >= 0; i--) {
5
6            if (digits[i] < 9) {
7                digits[i]++;
8                return digits;
9            }
10
11            digits[i] = 0;
12        }
13
14        int[] result = new int[digits.length + 1];
15        result[0] = 1;
16
17        return result;
18    }
19}