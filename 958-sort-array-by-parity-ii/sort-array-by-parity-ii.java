class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
             int j=nums.length-1;
        if((nums.length-1)%2==0){
             j=nums.length-2;
        }
   
        while(i<nums.length && j>0){
            if((nums[i]%2==0) && ( nums[j]%2!=0)){
                i=i+2;
                j=j-2;
            }
            else if(( nums[i]%2!=0) && ( nums[j]%2==0)){ int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i=i+2;
            j=j-2;

            }
            else if(nums[i]%2==0 && nums[j]%2==0){
                i=i+2;
            }
            else{
                j=j-2;
            }
        }
        return nums;
    }
}