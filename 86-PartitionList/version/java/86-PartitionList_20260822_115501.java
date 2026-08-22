// Last updated: 8/22/2026, 11:55:01 AM
1class Solution {
2    
3    public boolean isBalanced(TreeNode root) {
4        return height(root) != -1;
5    }
6
7    private int height(TreeNode node) {
8        if (node == null) {
9            return 0;
10        }
11
12        int leftHeight = height(node.left);
13
14        if (leftHeight == -1) {
15            return -1;
16        }
17
18        int rightHeight = height(node.right);
19
20        if (rightHeight == -1) {
21            return -1;
22        }
23
24        if (Math.abs(leftHeight - rightHeight) > 1) {
25            return -1;
26        }
27
28        return Math.max(leftHeight, rightHeight) + 1;
29    }
30}