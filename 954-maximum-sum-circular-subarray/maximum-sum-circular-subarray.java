class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int max = nums[0];      
        int min = nums[0];      
        int ans1 = nums[0];    
        int ans2 = nums[0];     
        int totalsum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            totalsum += nums[i];

          
            max = Math.max(max + nums[i], nums[i]);
            ans1 = Math.max(ans1, max);

          
            min = Math.min(min + nums[i], nums[i]);
            ans2 = Math.min(ans2, min);
        }

        if(ans1 < 0) {
            return ans1;
        }

        int diff = totalsum - ans2;

        return Math.max(ans1, diff);
    }
}
