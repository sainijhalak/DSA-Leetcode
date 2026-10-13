class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[]arr=new int[2];
         arr[0]=-1;
         arr[1]=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target && nums[i]>nums[j]){
                    if((nums[i]*nums[j]>max)){
                        max=nums[i]*nums[j];
                        arr[0]=i;
                        arr[1]=j;
                    }
                }
            }
        }
        return arr;
    }
}