# Last updated: 7/19/2026, 8:11:39 AM
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8    def countDominantNodes(self, root: TreeNode | None) -> int:
9        ans = 0
10        def dfs(node):
11            nonlocal ans
12            if not node:
13                return float('-inf')
14            leftMax = dfs(node.left)
15            rightMax = dfs(node.right)
16            currMax = max(node.val, leftMax, rightMax)
17            if node.val == currMax:
18                ans +=1
19            return currMax
20        dfs(root)
21        return ans