class Solution {
    public int maxAbsoluteSum(int[] nums) {
        if(nums.length==1) return Math.abs(nums[0]);
        int bemax=nums[0];
        int bemin=nums[0];
        int max=nums[0];
        int min=nums[0];
        int res=0;
        for(int i=1;i<nums.length;i++){
         bemax=Math.max(bemax+nums[i],nums[i]);
         max=Math.max(max,bemax);
         bemin=Math.min(bemin+nums[i],nums[i]);
        min=Math.min(min,bemin);
        res=Math.max(max,Math.abs(min));
        }
        return res;
    }
}