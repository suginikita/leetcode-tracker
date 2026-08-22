// Last updated: 8/22/2026, 9:42:12 AM
1class Solution {
2    
3    public TreeNode sortedListToBST(ListNode head) {
4        List<Integer> list = new ArrayList<>();
5
6        while (head != null) {
7            list.add(head.val);
8            head = head.next;
9        }
10
11        return buildBST(list, 0, list.size() - 1);
12    }
13
14    private TreeNode buildBST(List<Integer> list, int left, int right) {
15
16        if (left > right) {
17            return null;
18        }
19
20        int mid = left + (right - left) / 2;
21
22        TreeNode root = new TreeNode(list.get(mid));
23        root.left = buildBST(list, left, mid - 1);
24
25        root.right = buildBST(list, mid + 1, right);
26
27        return root;
28    }
29}