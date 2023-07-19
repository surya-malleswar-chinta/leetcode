class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        int carry = 0;
        
        while(first != null || second != null) {
            int sum = (first != null ? first.val : 0 ) + (second != null ? second.val : 0) + carry;
            if (sum > 9) {
                carry = 1;
                sum = sum-10;
            } else {
                carry = 0;
            }
            cur.next = new ListNode(sum);
            cur = cur.next;
            if (first != null) first = first.next;
            if (second != null) second = second.next;
        }
        
        if (carry > 0) cur.next = new ListNode(1);
        
        return newHead.next;
    }
}
