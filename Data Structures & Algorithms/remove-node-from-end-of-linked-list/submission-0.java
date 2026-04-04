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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fn = dummy;
        ListNode sn = dummy;
        for(int i = 0 ; i < n ; i++){
            fn = fn.next;
        }
        while(fn.next!=null){
            fn = fn.next;
            sn = sn.next;
        }
        sn.next = sn.next.next;
        return dummy.next;
    }
}
