class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0) return 0;
        if(nums.length==1 && nums[0]>k) return 0;
        if(nums.length==1 && nums[0]<k) return 1;
        int low=0;
        int high=0;
        long mul=1;
        int count=0;
        while(high<nums.length){
             mul=mul*nums[high];
             while(mul>=k){
             mul=mul/nums[low];
             low++;
             }
             if(mul<k){
                count=count+high-low+1;
             }
             high++;
        }
        return count;
    }
}