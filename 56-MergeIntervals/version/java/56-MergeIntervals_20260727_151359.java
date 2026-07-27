// Last updated: 7/27/2026, 3:13:59 PM
1class Solution {
2    public int mySqrt(int x) {
3        if (x == 0 || x == 1)
4            return x;
5
6        int left = 1;
7        int right = x;
8        int ans = 0;
9
10        while (left <= right) {
11            int mid = left + (right - left) / 2;
12            long square = (long) mid * mid;
13
14            if (square == x) {
15                return mid;
16            } else if (square < x) {
17                ans = mid;
18                left = mid + 1;
19            } else {
20                right = mid - 1;
21            }
22        }
23
24        return ans;
25    }
26}