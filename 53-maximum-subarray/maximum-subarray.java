class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
           int v=nums[i];
           int v2=sum+v;
           sum=Math.max(v,v2);
           max=Math.max(sum,max);
        }
        return max;
    }
}