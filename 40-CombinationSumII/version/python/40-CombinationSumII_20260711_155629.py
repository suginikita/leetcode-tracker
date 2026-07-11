# Last updated: 7/11/2026, 3:56:29 PM
1class Solution:
2    def firstMissingPositive(self, nums):
3        n = len(nums)
4
5        i = 0
6        while i < n:
7            correct = nums[i] - 1
8
9            if 1 <= nums[i] <= n and nums[i] != nums[correct]:
10                nums[i], nums[correct] = nums[correct], nums[i]
11            else:
12                i += 1
13        for i in range(n):
14            if nums[i] != i + 1:
15                return i + 1
16
17        return n + 1