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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
      int i=1;
      ListNode temp1=head;
      int j=0;
      ListNode temp2=head;
      while(i<k){
        temp1=temp1.next;
        i++;
      }
      while(j<count-k){
        temp2=temp2.next;
        j++;
      }
      int m=temp1.val;
      temp1.val=temp2.val;
      temp2.val=m;
      return head;
    }
}