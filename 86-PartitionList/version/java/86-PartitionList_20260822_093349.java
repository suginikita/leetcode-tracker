// Last updated: 8/22/2026, 9:33:49 AM
1class Solution {
2    public int maxDepth(TreeNode root) {
3        
4        if (root == null) {
5            return 0;
6        }
7
8        int leftDepth = maxDepth(root.left);
9        int rightDepth = maxDepth(root.right);
10
11        return 1 + Math.max(leftDepth, rightDepth);
12    }
13}