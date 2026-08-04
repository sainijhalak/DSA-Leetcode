class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<=1) return true;
        int i=0;
        int j=1;
        while(nums[i]==nums[j]){
            j++;
            if(j==nums.length) return true;
        }
       if(nums[i]<nums[j]){
        while(j<nums.length){
            if(nums[j-1]>nums[j]) return false;
            j++;
        }
       }
       else if(nums[i]>nums[j]){
         while(j<nums.length){
            if(nums[j-1]<nums[j]) return false;
            j++;
        }
       }
       return true;
    }
}