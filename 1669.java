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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode a_prev = list1;
        ListNode b_curr = list1;
        a--;
        while(a>0) {
            a_prev = a_prev.next;
            a--;
        }
        while(b>0) {
            b_curr = b_curr.next;
            b--;
        }
        ListNode list2_tail = list2;
        while(list2_tail.next != null) list2_tail.next;
        a_prev.next = list2;
        list2_tail.next = b_curr.next;
        return list1;
    }
}