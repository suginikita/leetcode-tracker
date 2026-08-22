// Last updated: 8/22/2026, 11:57:22 AM
1class Solution {
2    public int minDepth(TreeNode root) {
3
4        if (root == null) {
5            return 0;
6        }
7
8        Queue<TreeNode> queue = new LinkedList<>();
9        queue.add(root);
10
11        int depth = 1;
12
13        while (!queue.isEmpty()) {
14
15            int size = queue.size();
16
17            for (int i = 0; i < size; i++) {
18
19                TreeNode node = queue.poll();
20                if (node.left == null && node.right == null) {
21                    return depth;
22                }
23
24                if (node.left != null) {
25                    queue.add(node.left);
26                }
27
28                if (node.right != null) {
29                    queue.add(node.right);
30                }
31            }
32
33            depth++;
34        }
35
36        return depth;
37    }
38}