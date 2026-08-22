// Last updated: 8/22/2026, 12:01:13 PM
1class Solution {
2    public void flatten(TreeNode root) {
3        if (root == null) {
4            return;
5        }
6
7        flatten(root.left);
8        flatten(root.right);
9
10        TreeNode temp = root.right;
11
12        root.right = root.left;
13        root.left = null;
14
15        TreeNode current = root;
16
17        while (current.right != null) {
18            current = current.right;
19        }
20
21        current.right = temp;
22    }
23}