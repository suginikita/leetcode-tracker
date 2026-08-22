// Last updated: 8/22/2026, 9:38:40 AM
1class Solution {
2    public List<List<Integer>> levelOrderBottom(TreeNode root) {
3
4        List<List<Integer>> result = new ArrayList<>();
5
6        if (root == null) {
7            return result;
8        }
9
10        Queue<TreeNode> queue = new LinkedList<>();
11        queue.offer(root);
12
13        while (!queue.isEmpty()) {
14
15            int size = queue.size();
16            List<Integer> level = new ArrayList<>();
17
18            for (int i = 0; i < size; i++) {
19
20                TreeNode node = queue.poll();
21                level.add(node.val);
22
23                if (node.left != null) {
24                    queue.offer(node.left);
25                }
26
27                if (node.right != null) {
28                    queue.offer(node.right);
29                }
30            }
31
32            result.add(0, level);
33        }
34
35        return result;
36    }
37}