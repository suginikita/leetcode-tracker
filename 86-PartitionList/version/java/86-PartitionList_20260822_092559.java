// Last updated: 8/22/2026, 9:25:59 AM
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3
4        if (p == null && q == null) {
5            return true;
6        }
7
8        if (p == null || q == null) {
9            return false;
10        }
11
12        if (p.val != q.val) {
13            return false;
14        }
15
16        return isSameTree(p.left, q.left)
17                && isSameTree(p.right, q.right);
18    }
19}