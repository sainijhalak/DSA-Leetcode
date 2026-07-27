class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int secmax=0;
        int idx=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]>max){
                max=nums[i];
                idx=i;
             }
        }
          for(int i=0;i<nums.length;i++){
            if(i==idx) continue;
             secmax=Math.max(nums[i],secmax);
        }
        return (max-1)*(secmax-1);
    }
}