class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       
        List<Integer> values = new ArrayList<>();
        
        for (ListNode list : lists) {
            ListNode temp = list;
            while (temp != null) {
                values.add(temp.val);
                temp = temp.next;
            }
        }
        
        
        Collections.sort(values);
        
      
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;
    }
}