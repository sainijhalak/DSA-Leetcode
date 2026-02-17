class Solution {
    public int maxSubArray(int[] nums) {
        int be=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int c1=nums[i];
            int c2=nums[i]+be;
            be=Math.max(c1,c2);
            ans=Math.max(ans,be);

        }
        return ans;
    }
}