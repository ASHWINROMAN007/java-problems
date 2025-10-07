/**
 * Definition for singly-linked list
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode re = head;
        while(re!=null&&re.next!=null)
        {
            if(re.val==re.next.val)
            {
              re.next = re.next.next;
            }
            else{
            re = re.next;
            }
        }
        return head;
    }
}