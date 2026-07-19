# Last updated: 7/19/2026, 8:05:13 AM
1class Solution:
2    def canReach(self, start: list[int], target: list[int]) -> bool:
3        return (start[0] + start[1]) % 2 == (target[0] + target[1]) % 2
4        