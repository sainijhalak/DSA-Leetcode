class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Step 1: Saare values uthao
        List<Integer> values = new ArrayList<>();
        
        for (ListNode list : lists) {
            ListNode temp = list;
            while (temp != null) {
                values.add(temp.val);
                temp = temp.next;
            }
        }
        
        // Step 2: Sort karo
        Collections.sort(values);
        
        // Step 3: Nayi list banao
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;
    }
}