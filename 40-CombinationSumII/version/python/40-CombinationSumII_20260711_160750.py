# Last updated: 7/11/2026, 4:07:50 PM
1class Solution:
2    def permute(self, nums):
3        result = []
4        def backtrack(path):
5            if len(path) == len(nums):
6                result.append(path[:])
7                return
8            for num in nums:
9                if num in path:
10                    continue
11                path.append(num)
12                backtrack(path)
13                path.pop()
14
15        backtrack([])
16        return result