// Last updated: 8/22/2026, 9:03:46 AM
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        
4        ListNode smallDummy = new ListNode(0);
5        ListNode largeDummy = new ListNode(0);
6        
7        ListNode small = smallDummy;
8        ListNode large = largeDummy;
9        
10        ListNode current = head;
11        
12        while (current != null) {
13            if (current.val < x) {
14                small.next = current;
15                small = small.next;
16            } else {
17                large.next = current;
18                large = large.next;
19            }
20            
21            current = current.next;
22        }
23        
24        large.next = null;
25        small.next = largeDummy.next;
26        
27        return smallDummy.next;
28    }
29}