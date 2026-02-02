class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=1;
        int j=0;
      while(i<nums.length){
if(nums[i]==nums[i-1]){
    i++;
}
else{
    j++;
nums[j]=nums[i];
count++;
i++;
}
       }
       return count;
    }
}