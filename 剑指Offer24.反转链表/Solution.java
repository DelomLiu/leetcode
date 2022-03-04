/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode res = new ListNode(-1);
        ListNode temp;
        while (head != null) {
            temp = head;
            head = head.next;
            temp.next = res.next;
            res.next = temp;
        }
        return res.next;
    }
}