class Solution {
    public int alternatingSum(int[] nums) {
    int  OddSum=0;
    int  EvenSum=0;
    for(int i=0;i<nums.length;i++){
        if(i%2==0){
            EvenSum =EvenSum+nums[i];

        }
        else{
            OddSum=OddSum+nums[i];
        }
    }
    return EvenSum-OddSum;

    }
}