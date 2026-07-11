# Last updated: 7/11/2026, 4:14:50 PM
1class Solution:
2    def permuteUnique(self, nums):
3        nums.sort()
4        result = []
5        used = [False] * len(nums)
6        def backtrack(path):
7            if len(path) == len(nums):
8                result.append(path[:])
9                return
10            for i in range(len(nums)):
11                if used[i]:
12                    continue
13                if i > 0 and nums[i] == nums[i - 1] and not used[i - 1]:
14                    continue
15                used[i] = True
16                path.append(nums[i])
17                backtrack(path)
18                path.pop()
19                used[i] = False
20        backtrack([])
21        return result