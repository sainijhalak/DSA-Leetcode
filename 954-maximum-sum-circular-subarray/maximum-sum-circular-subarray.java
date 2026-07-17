class Solution {
    public int maxSubarraySumCircular(int[] nums) {
         int max=nums[0];
        int min=nums[0];
        int bmax=nums[0];
        int bmin=nums[0];
        int tt=nums[0];
        for(int i=1;i<nums.length;i++){
            tt=tt+nums[i];
            bmax=Math.max(bmax+nums[i],nums[i]);
            max=Math.max(bmax,max);
            bmin=Math.min(bmin+nums[i],nums[i]);
            min=Math.min(bmin,min);
        }
        if(max<0) return max;
        return Math.max(max,tt-min);
    }
}