/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int cnt = 1;
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
            cnt++;
        }
        cnt /= 2;
        
        while (head.next != null) {
            head = head.next;
            if (--cnt == 0) break;
        }
        return head;
    }
}