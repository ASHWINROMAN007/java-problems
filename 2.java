class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0);
        ListNode tail = dum;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int dig1 = (l1 != null) ? l1.val : 0;
            int dig2 = (l2 != null) ? l2.val : 0;

            int sum = dig1 + dig2 + carry;
            int dig = sum % 10;      // Current digit to store
            carry = sum / 10;        // Update carry

            ListNode ne = new ListNode(dig);
            tail.next = ne;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return dum.next;
    }
}
