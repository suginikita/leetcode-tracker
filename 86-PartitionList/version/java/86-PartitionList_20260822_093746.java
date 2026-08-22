// Last updated: 8/22/2026, 9:37:46 AM
1class Solution {
2    private int postIndex;
3    private Map<Integer, Integer> map = new HashMap<>();
4
5    public TreeNode buildTree(int[] inorder, int[] postorder) {
6        for (int i = 0; i < inorder.length; i++) {
7            map.put(inorder[i], i);
8        }
9        postIndex = postorder.length - 1;
10
11        return build(postorder, 0, inorder.length - 1);
12    }
13
14    private TreeNode build(int[] postorder, int left, int right) {
15
16        if (left > right) {
17            return null;
18        }
19
20        int rootValue = postorder[postIndex--];
21
22        TreeNode root = new TreeNode(rootValue);
23
24        int index = map.get(rootValue);
25
26        root.right = build(postorder, index + 1, right);
27
28        root.left = build(postorder, left, index - 1);
29
30        return root;
31    }
32}