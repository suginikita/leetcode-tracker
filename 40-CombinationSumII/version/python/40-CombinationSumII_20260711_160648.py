# Last updated: 7/11/2026, 4:06:48 PM
1class Solution:
2    def jump(self, nums):
3        jumps = 0
4        current_end = 0
5        farthest = 0
6        for i in range(len(nums) - 1):
7            farthest = max(farthest, i + nums[i])
8            if i == current_end:
9                jumps += 1
10                current_end = farthest
11        return jumps