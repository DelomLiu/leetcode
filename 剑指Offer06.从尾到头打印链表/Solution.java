/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode p = head;
        while(p != null) {
            p=p.next;
            len++;
        }
        int[] res = new int[len];
        while(head != null) {
            res[--len] = head.val;
            head = head.next;
        }
        return res;
    }
}