class Solution {
    public int[] transformArray(int[] nums) {
    
    for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            nums[i]=0;
        }
        else{
            nums[i]=1;
        }
    }
    int j=0;
    int k=nums.length-1;
    while(j<k){
        if(nums[j]!=0 && nums[k]==0){
            int temp=nums[j];
            nums[j]=nums[k];
            nums[k]=temp;
            k--;
        }
        else if(nums[j]!=0 && nums[k]!=0){
            k--;
        }
        else if(nums[j]==0){
            j++;
        }
        else{
            break;
        }
    }
    return nums;

    }
}