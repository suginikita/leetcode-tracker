// Last updated: 8/5/2026, 2:25:51 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length <= 2) {
4            return nums.length;
5        }
6
7        int index = 2;
8
9        for (int i = 2; i < nums.length; i++) {
10            if (nums[i] != nums[index - 2]) {
11                nums[index] = nums[i];
12                index++;
13            }
14        }
15
16        return index;
17    }
18}