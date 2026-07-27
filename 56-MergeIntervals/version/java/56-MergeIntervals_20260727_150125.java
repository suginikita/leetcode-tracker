// Last updated: 7/27/2026, 3:01:25 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14
15class Solution {
16    public ListNode rotateRight(ListNode head, int k) {
17
18        if (head == null || head.next == null || k == 0)
19            return head;
20        ListNode tail = head;
21        int length = 1;
22
23        while (tail.next != null) {
24            tail = tail.next;
25            length++;
26        }
27        tail.next = head;
28        k = k % length;
29        int steps = length - k - 1;
30        ListNode newTail = head;
31
32        while (steps-- > 0) {
33            newTail = newTail.next;
34        }
35        ListNode newHead = newTail.next;
36        newTail.next = null;
37
38        return newHead;
39    }
40}