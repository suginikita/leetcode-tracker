# Last updated: 7/9/2026, 10:06:50 AM
class Solution:
    def reverseKGroup(self, head, k):
        count = 0
        temp = head
        while temp and count < k:
            temp = temp.next
            count += 1
        if count < k:
            return head
        prev = None
        curr = head
        for i in range(k):
            next_node = curr.next
            curr.next = prev
            prev = curr
            curr = next_node
        head.next = self.reverseKGroup(curr, k)
        return prev