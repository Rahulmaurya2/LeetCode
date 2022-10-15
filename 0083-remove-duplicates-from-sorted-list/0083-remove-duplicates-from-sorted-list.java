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
    public ListNode deleteDuplicates(ListNode head) {
    ListNode nodei= head;
    //ListNode nodej=head.next;
      while(nodei!=null && nodei.next != null){
        if(nodei.val==nodei.next.val){
          nodei.next=nodei.next.next;
        } else nodei=nodei.next;
      }
      return head;
}
}