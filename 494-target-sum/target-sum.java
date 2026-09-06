class Solution {
   static int findways(int[]nums,int t,int i,int sum){
        if(i==nums.length){
            if(sum==t){
               return 1;
            }
            return 0;
        }
       return findways(nums,t,i+1,sum-nums[i])+findways(nums,t,i+1,sum+nums[i]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int ans= findways(nums,target,0,0);
        return ans;
    }
}