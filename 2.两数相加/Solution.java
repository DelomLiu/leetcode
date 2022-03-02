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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(-1);
        ListNode p = result;
        int flag = 0; //标记进位

        while (l1!=null || l2!=null || flag!=0) {

            int a, b;
            if (l1==null) {
                a = 0;
            } else {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 == null) {
                b = 0;
            } else {
                b = l2.val;
                l2 = l2.next;
            }

            int sum = a + b + flag;
            flag = sum / 10;
            ListNode temp = new ListNode(sum % 10);
            p.next = temp;
            p = p.next;
        }

        return result.next;
    }
}