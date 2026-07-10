class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0 && (nums[i]-1)<nums.length && nums[nums[i]-1]!=nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
int j=0;
        while(j<nums.length){
            if(nums[j]!=j+1) return j+1;
            j++;
        }
       return nums.length+1;
    }
}