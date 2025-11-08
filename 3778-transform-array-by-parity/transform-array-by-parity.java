class Solution {
    public int[] transformArray(int[] nums) {
      int evenCount = 0;
        for(int i:nums){
            if(i % 2==0) evenCount++;
        }
        int i = 0;
        for(i = 0; i < evenCount; i++){
            nums[i] = 0;
        }
        while(i < nums.length){
            nums[i++] = 1;
        }

        return nums;
    }
}