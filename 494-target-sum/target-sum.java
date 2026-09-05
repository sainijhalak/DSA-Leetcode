class Solution {
     static int ans;
    static void findways(int[]nums,int t,int i,int sum){
        if(i==nums.length){
            if(sum==t){
                ans++;
            }
            return;
        }
        findways(nums,t,i+1,sum-nums[i]);
        findways(nums,t,i+1,sum+nums[i]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        ans=0;
        findways(nums,target,0,0);
        return ans;
    }
}