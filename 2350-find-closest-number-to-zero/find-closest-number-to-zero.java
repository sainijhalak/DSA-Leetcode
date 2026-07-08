class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Math.abs(nums[0]);
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
        if(Math.abs(nums[i])<Math.abs(ans)){
            ans=nums[i];
            min=Math.abs(nums[i]);
        }
        else if(Math.abs(nums[i])==Math.abs(ans)){
            ans=Math.max(ans,nums[i]);
        }
        }
        return ans;
    }
}