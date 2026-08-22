// Last updated: 8/22/2026, 9:27:13 AM
1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        return isMirror(root.left, root.right);
4    }
5
6    public boolean isMirror(TreeNode left, TreeNode right) {
7
8        if (left == null && right == null) {
9            return true;
10        }
11
12        if (left == null || right == null) {
13            return false;
14        }
15
16        return left.val == right.val
17                && isMirror(left.left, right.right)
18                && isMirror(left.right, right.left);
19    }
20}