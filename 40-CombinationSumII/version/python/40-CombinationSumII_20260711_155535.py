# Last updated: 7/11/2026, 3:55:35 PM
1class Solution:
2    def combinationSum2(self, candidates, target):
3        result = []
4
5        candidates.sort()
6
7        def backtrack(start, path, total):
8            if total == target:
9                result.append(path[:])
10                return
11
12            if total > target:
13                return
14
15            for i in range(start, len(candidates)):
16
17                # Skip duplicates
18                if i > start and candidates[i] == candidates[i - 1]:
19                    continue
20
21                path.append(candidates[i])
22
23                backtrack(i + 1, path, total + candidates[i])
24
25                path.pop()
26
27        backtrack(0, [], 0)
28
29        return result