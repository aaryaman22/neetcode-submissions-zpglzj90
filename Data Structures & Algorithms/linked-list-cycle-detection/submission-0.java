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
    public boolean hasCycle(ListNode head) {
        ListNode fp = head;
        ListNode sp = head;
        while(Objects.nonNull(fp) && Objects.nonNull(sp)){
            if(fp.next!=null){
                fp = fp.next.next;
            }else{
                return false;
            }
            sp = sp.next;
            if(sp==fp)return true;
        }
        return false;
    }
}
