// Last updated: 8/22/2026, 9:24:31 AM
1class Solution {
2    public boolean isValidBST(TreeNode root) {
3        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
4    }
5
6    private boolean check(TreeNode root, long min, long max) {
7        if (root == null) {
8            return true;
9        }
10
11        if (root.val <= min || root.val >= max) {
12            return false;
13        }
14
15        return check(root.left, min, root.val)
16                && check(root.right, root.val, max);
17    }
18}