// Last updated: 8/22/2026, 9:19:08 AM
1class Solution {
2    public List<Integer> inorderTraversal(TreeNode root) {
3        
4        List<Integer> result = new ArrayList<>();
5        Stack<TreeNode> stack = new Stack<>();
6        
7        TreeNode current = root;
8        
9        while (current != null || !stack.isEmpty()) {
10            while (current != null) {
11                stack.push(current);
12                current = current.left;
13            }
14            current = stack.pop();
15            result.add(current.val);
16            current = current.right;
17        }
18        
19        return result;
20    }
21}