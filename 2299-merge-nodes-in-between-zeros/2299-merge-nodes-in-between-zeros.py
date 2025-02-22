# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        ln = ListNode()
        cur = ln
        tmp = 0
        while (head is not None):
            if head.val == 0:
                if tmp != 0:
                    if cur.val == 0:
                        cur.val = tmp
                    else:
                        cur.next = ListNode()
                        cur.next.val = tmp
                        cur = cur.next
                    tmp = 0
            else:
                tmp += head.val
            head = head.next
    
        return ln