// Last updated: 7/20/2026, 10:10:53 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxReach = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (i > maxReach) {
7                return false;
8            }
9            maxReach = Math.max(maxReach, i + nums[i]);
10            if (maxReach >= nums.length - 1) {
11                return true;
12            }
13        }
14
15        return true;
16    }
17}