class Solution {
    public ListNode removeElements(ListNode head, int val) {

        
        while (head != null && head.val == val) {
            head = head.next;
        }

        
        if (head == null) return null;

        
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {

            if (temp.val == val) {
               
                prev.next = temp.next;  
                
            } else {
                
                prev = temp;
            }

            temp = temp.next;
        }

        return head;
    }
}
