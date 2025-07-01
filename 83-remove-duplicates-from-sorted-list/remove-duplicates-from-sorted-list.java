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
    ListNode temp ;
    if(head==null ||head.next==null) return head;
    if(head.val==head.next.val){
        temp=head.next;
        while(temp.next!=null ){
            if(temp.next.val==temp.val ) temp=temp.next;
            else break;
        }
        head.next=temp.next; 
    }
    head.next=deleteDuplicates(head.next);
    return head;
  }
}