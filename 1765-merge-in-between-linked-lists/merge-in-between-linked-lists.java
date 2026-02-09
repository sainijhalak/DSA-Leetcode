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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int c=0;
        ListNode temp=list1;
        while(c<a-1){
            temp=temp.next;
            c++;
        }
        ListNode remove=temp.next;
        
        while(c<b-1){
            remove=remove.next;
            c++;
        }
        ListNode t=remove.next;
        remove.next=null;
        temp.next=list2;
        temp=temp.next;
         while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=t;
        
       
        return list1;

    }
}