// Last updated: 8/22/2026, 9:17:04 AM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        
4        if (head == null || left == right) {
5            return head;
6        }
7
8        ListNode dummy = new ListNode(0);
9        dummy.next = head;
10
11        ListNode prev = dummy;
12        for (int i = 1; i < left; i++) {
13            prev = prev.next;
14        }
15
16        ListNode current = prev.next;
17        for (int i = 0; i < right - left; i++) {
18            ListNode next = current.next;
19            current.next = next.next;
20            next.next = prev.next;
21            prev.next = next;
22        }
23
24        return dummy.next;
25    }
26}