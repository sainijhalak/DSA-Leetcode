import java.util.*;

class Solution {
    public int minOperations(List<Integer> nums, int k) {

        Set<Integer> seen = new HashSet<>();
        int operations = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {

            operations++;

            int val = nums.get(i);

            if (val <= k) {
                seen.add(val);
            }

            if (seen.size() == k) {
                break;
            }
        }

        return operations;
    }
}
