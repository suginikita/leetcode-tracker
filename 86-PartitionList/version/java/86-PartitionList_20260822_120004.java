// Last updated: 8/22/2026, 12:00:04 PM
1class Solution {
2    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
3        List<List<Integer>> result = new ArrayList<>();
4        List<Integer> path = new ArrayList<>();
5
6        dfs(root, targetSum, path, result);
7
8        return result;
9    }
10
11    private void dfs(TreeNode node, int targetSum,
12                     List<Integer> path,
13                     List<List<Integer>> result) {
14
15        if (node == null) {
16            return;
17        }
18
19        path.add(node.val);
20
21        if (node.left == null && node.right == null
22                && targetSum == node.val) {
23
24            result.add(new ArrayList<>(path));
25        }
26
27        dfs(node.left, targetSum - node.val, path, result);
28        dfs(node.right, targetSum - node.val, path, result);
29
30        path.remove(path.size() - 1);
31    }
32}