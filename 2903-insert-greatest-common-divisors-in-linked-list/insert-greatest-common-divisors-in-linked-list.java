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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        ListNode ans=head;
        while(temp!=null && temp.next!=null){
            int s=gcd(temp.val ,temp.next.val);
            ListNode dum =new ListNode(s);
            dum.next=temp.next;
            temp.next=dum; 
            temp=dum.next;
        }
        return ans;
    }
    public int gcd(int x,int y){ int min=Math.min(x,y);
    for(int i=min;i>0;i--){
        if(x%i==0 && y%i==0){
            return i;
        }
    }
    return 1;
    }
   
}