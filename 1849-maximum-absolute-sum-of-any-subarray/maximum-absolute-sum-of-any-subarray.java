class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int be=nums[0];
        int me=nums[0];
        int ans=nums[0];
        if(nums.length==1){
            return Math.abs(nums[0]);
        }
        for(int i=1;i<nums.length;i++){
be=Math.max(nums[i],nums[i]+be);
me=Math.min(nums[i],nums[i]+me);
ans=Math.max(ans,Math.max(Math.abs(be),Math.abs(me)));
        }
        return ans;
    }
}