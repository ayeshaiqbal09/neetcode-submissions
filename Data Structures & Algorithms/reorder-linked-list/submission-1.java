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
    public void reorderList(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        ListNode prev = slow.next = null;
        while (head2 != null) {
            ListNode temp = head2.next;
            head2.next = prev;
            prev = head2;
            head2 = temp;
        }
        ListNode curr = head;
        head2 = prev;
        while (head2 != null) {
            ListNode temp1 = curr.next;
            ListNode temp2 = head2.next;
            curr.next = head2;
            head2.next = temp1;
            curr = temp1;
            head2 = temp2;
        }
    }
}
