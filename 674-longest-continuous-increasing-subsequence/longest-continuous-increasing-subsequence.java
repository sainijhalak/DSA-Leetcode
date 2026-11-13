class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=1;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) n++;
            else{
                ans=Math.max(n,ans);
                n=1;
            }
        }
        ans=Math.max(n,ans);
        return ans;
    }
}