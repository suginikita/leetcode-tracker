# Last updated: 7/9/2026, 10:06:52 AM
class Solution:
    def swapPairs(self, head):
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy
        while prev.next and prev.next.next:
            first = prev.next
            second = first.next
            first.next = second.next
            second.next = first
            prev.next = second
            prev = first
        return dummy.next