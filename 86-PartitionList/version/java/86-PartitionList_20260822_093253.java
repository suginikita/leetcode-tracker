// Last updated: 8/22/2026, 9:32:53 AM
1class Solution {
2    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
13        boolean leftToRight = true;
14        
15        while (!queue.isEmpty()) {
16            
17            int size = queue.size();
18            List<Integer> level = new ArrayList<>();
19            
20            for (int i = 0; i < size; i++) {
21                
22                TreeNode node = queue.poll();
23                level.add(node.val);
24                
25                if (node.left != null) {
26                    queue.offer(node.left);
27                }
28                
29                if (node.right != null) {
30                    queue.offer(node.right);
31                }
32            }
33            if (!leftToRight) {
34                Collections.reverse(level);
35            }
36            
37            result.add(level);
38            leftToRight = !leftToRight;
39        }
40        
41        return result;
42    }
43}