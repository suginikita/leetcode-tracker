// Last updated: 8/5/2026, 2:27:27 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode prev = dummy;
7        ListNode curr = head;
8
9        while (curr != null) {
10            while (curr.next != null && curr.val == curr.next.val) {
11                curr = curr.next;
12            }
13
14            if (prev.next == curr) {
15                prev = prev.next;
16            } else {
17                prev.next = curr.next;
18            }
19
20            curr = curr.next;
21        }
22
23        return dummy.next;
24    }
25}