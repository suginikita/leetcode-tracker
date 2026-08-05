// Last updated: 8/5/2026, 2:26:46 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7
8            if (nums[mid] == target) {
9                return true;
10            }
11
12           
13            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
14                left++;
15                right--;
16            }
17           
18            else if (nums[left] <= nums[mid]) {
19                if (nums[left] <= target && target < nums[mid]) {
20                    right = mid - 1;
21                } else {
22                    left = mid + 1;
23                }
24            }
25            else {
26                if (nums[mid] < target && target <= nums[right]) {
27                    left = mid + 1;
28                } else {
29                    right = mid - 1;
30                }
31            }
32        }
33
34        return false;
35    }
36}