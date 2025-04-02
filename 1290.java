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
    public int getDecimalValue(ListNode head) {
        int t=0;
        ListNode p = head;
        while(p!=null)
        {
            t=(t*2)+p.val;
            p=p.next;
        }
        return t;
    }
}