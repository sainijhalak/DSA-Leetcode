class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1;
        int dcr=1;
        int n1=0;
        int n2=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) inc++;
            else {
                n1=Math.max(inc,n1);
                inc=1;
            }
        }
        n1=Math.max(inc,n1);
          for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) dcr++;
            else {
                n2=Math.max(dcr,n2);
                dcr=1;
            }
        }
         n2=Math.max(dcr,n2);
        return Math.max(n1,n2);
    }
}