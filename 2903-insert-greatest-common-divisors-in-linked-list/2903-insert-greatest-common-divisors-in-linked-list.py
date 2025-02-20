# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = head
        
        while cur.next is not None:
            cur_val = cur.val
            next_val = cur.next.val

            gcd = get_gcd(cur_val, next_val)

            cur.next = ListNode(gcd, cur.next)
            cur = cur.next.next

        return head


def get_gcd(a, b):
    if b == 0:
        return a
    return get_gcd(b, a % b)
