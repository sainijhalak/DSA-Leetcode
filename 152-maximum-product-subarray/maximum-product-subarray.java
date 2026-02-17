class Solution {
    public int maxProduct(int[] nums) {
        int be=nums[0];
        int ans=nums[0];
        int me=nums[0];
        for(int i=1;i<nums.length;i++){
            int c1=nums[i];
            int c2=nums[i]*be;
            int c3=nums[i]*me;
            be=Math.max(c1, Math.max(c2,c3));
            me=Math.min(c1,Math.min(c2,c3));
            ans=Math.max(ans,be);
        }
        return ans;
    }
}