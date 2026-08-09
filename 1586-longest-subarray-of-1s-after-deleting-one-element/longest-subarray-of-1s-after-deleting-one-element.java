class Solution {
    public int longestSubarray(int[] nums) {
        int low=0;
        int zero=0;
        int one=0;
        int high=0;
        int ans=0;
        while(high<nums.length){
            if(nums[high]==1) one++;
            else{
                zero++;
            }
            while(zero>1){
                if(nums[low]==0) zero--;
                else one--;
                if(zero==1){
              ans=Math.max(one,ans);
                }
                low++;
            }
            if(zero==1){
              ans=Math.max(one,ans);
                }
            high++;
        }
        if(one==nums.length) return one-1;
        return ans;
    }
}