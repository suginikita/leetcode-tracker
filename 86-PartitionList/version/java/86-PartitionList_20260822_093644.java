// Last updated: 8/22/2026, 9:36:44 AM
1class Solution {
2    int preIndex = 0;
3    HashMap<Integer, Integer> map = new HashMap<>();
4
5    public TreeNode buildTree(int[] preorder, int[] inorder) {
6
7        for (int i = 0; i < inorder.length; i++) {
8            map.put(inorder[i], i);
9        }
10
11        return build(preorder, 0, inorder.length - 1);
12    }
13
14    private TreeNode build(int[] preorder, int left, int right) {
15
16        if (left > right) {
17            return null;
18        }
19        int rootValue = preorder[preIndex++];
20        TreeNode root = new TreeNode(rootValue);
21
22        int index = map.get(rootValue);
23
24        root.left = build(preorder, left, index - 1);
25
26        root.right = build(preorder, index + 1, right);
27
28        return root;
29    }
30}