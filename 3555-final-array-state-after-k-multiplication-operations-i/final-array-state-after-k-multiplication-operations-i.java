class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        int j;
        for(int i=0;i<k;i++){ 
            int min=Integer.MAX_VALUE;
             int minIndex = 0;
            for( j=0;j<nums.length;j++){
                if(nums[j]<min){
    min=Math.min(min,nums[j]);
     minIndex = j;
   
}
          }
 nums[minIndex] = nums[minIndex] * multiplier;
  
        } 
        
        return nums;
    }
}