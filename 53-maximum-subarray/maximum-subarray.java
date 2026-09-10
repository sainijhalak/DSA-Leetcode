class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=sum+nums[i];
            sum=Math.max(v1,v2);
            max=Math.max(max,sum);
        }
        return max;
    }
}