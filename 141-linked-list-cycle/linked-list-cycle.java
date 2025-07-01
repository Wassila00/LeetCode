/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)return false;
        ListNode fast;
        ListNode slow;
        fast=slow=head;
        

        do{
              if(fast.next==null || fast.next.next==null) return false;
              else{
                slow=slow.next;
                fast=fast.next.next;
                }
         }while (slow!=fast && fast!=null);
        if(fast==null) return false;
        
        return true;
    }
}
