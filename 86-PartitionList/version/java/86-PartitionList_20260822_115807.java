// Last updated: 8/22/2026, 11:58:07 AM
1class Solution {
2    public boolean hasPathSum(TreeNode root, int targetSum) {
3
4        if (root == null) {
5            return false;
6        }
7        if (root.left == null && root.right == null) {
8            return targetSum == root.val;
9        }
10
11        targetSum -= root.val;
12
13        return hasPathSum(root.left, targetSum) ||
14               hasPathSum(root.right, targetSum);
15    }
16}