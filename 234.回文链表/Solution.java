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
    public boolean isPalindrome(ListNode head) {
        //快慢指针找中点
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast!=null)
            slow = slow.next;
        //翻转中点之后的链表
        ListNode temp = new ListNode(-1);
        ListNode cur;
        while (slow!=null) {
            cur = slow.next;
            slow.next = temp.next;
            temp.next = slow;
            slow = cur;
        }
        //比较
        temp = temp.next;
        while(temp != null) {
            if(temp.val != head.val)
                return false;
            temp = temp.next;
            head = head.next;
        }
        return true;
    }
}