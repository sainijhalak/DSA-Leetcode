import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> pos = new ArrayList<>(); // positives
        List<Integer> neg = new ArrayList<>(); // negatives

        // Separate positives and negatives
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0)
                pos.add(nums[i] * nums[i]); // square while adding
            else
                neg.add(nums[i] * nums[i]); // square while adding
        }

        // Handle edge cases
        if (neg.size() == 0) {
            int[] ans = new int[nums.length];
            for (int i = 0; i < pos.size(); i++) ans[i] = pos.get(i);
            return ans;
        }

        if (pos.size() == 0) {
            Collections.reverse(neg);
            int[] ans = new int[nums.length];
            for (int i = 0; i < neg.size(); i++) ans[i] = neg.get(i);
            return ans;
        }

        // Reverse negatives since their squares go decreasing → increasing
        Collections.reverse(neg);

        // Convert lists manually into arrays
        int[] nums1 = new int[pos.size()];
        for (int i = 0; i < pos.size(); i++) {
            nums1[i] = pos.get(i);
        }

        int[] nums2 = new int[neg.size()];
        for (int i = 0; i < neg.size(); i++) {
            nums2[i] = neg.get(i);
        }

        // Merge two sorted arrays
        int i = 0, j = 0, idx = 0;
        int m = nums1.length, n = nums2.length;
        int[] res = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[idx++] = nums1[i++];
            } else {
                res[idx++] = nums2[j++];
            }
        }

        while (i < m) {
            res[idx++] = nums1[i++];
        }

        while (j < n) {
            res[idx++] = nums2[j++];
        }

        return res;
    }
}

    
