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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode newList = null;
        ListNode head = null;
        while(Objects.nonNull(head1) && Objects.nonNull(head2)){
            ListNode chosen = null;
            if(head1.val < head2.val){
                chosen = head1;
                head1 = head1.next;
            }else{
                chosen = head2;
                head2 = head2.next;
            }
            if(newList==null){
                newList = chosen;
                head = newList;
            }else{
                newList.next = chosen;
                newList = newList.next;
            }
        }
        if (newList == null) {
            return head1 != null ? head1 : head2;
        }
        newList.next = (head1 != null) ? head1 : head2;

        return head;
    }
}