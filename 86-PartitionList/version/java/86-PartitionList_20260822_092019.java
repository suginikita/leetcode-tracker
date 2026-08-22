// Last updated: 8/22/2026, 9:20:19 AM
1class Solution {
2    
3    public List<TreeNode> generateTrees(int n) {
4        if (n == 0) {
5            return new ArrayList<>();
6        }
7        
8        return build(1, n);
9    }
10    
11    private List<TreeNode> build(int start, int end) {
12        List<TreeNode> result = new ArrayList<>();
13      
14        if (start > end) {
15            result.add(null);
16            return result;
17        }
18        for (int i = start; i <= end; i++) {
19            List<TreeNode> leftTrees = build(start, i - 1);
20            
21            List<TreeNode> rightTrees = build(i + 1, end);
22            
23            for (TreeNode left : leftTrees) {
24                for (TreeNode right : rightTrees) {
25                    
26                    TreeNode root = new TreeNode(i);
27                    root.left = left;
28                    root.right = right;
29                    
30                    result.add(root);
31                }
32            }
33        }
34        
35        return result;
36    }
37}