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
    ListNode deleteKro(ListNode head, HashSet<Integer> set){
        while(set.contains(head.val)){
            head=head.next;
        }
        ListNode prev=head;
        ListNode temp=head;
        while(temp!=null){
             if(set.contains(temp.val)){
                prev.next=temp.next;
             }
             else{
                 prev=temp;
             }
            
             temp=temp.next;
        }
        return head;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        head=deleteKro(head,set);
        return head;
    }
}