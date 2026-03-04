class Solution {
   static int sumOfDigit(int n){
    int sum=0;
    while(n>0){
        int r=n%10;
        sum=sum+r;
        n=n/10;
    }
    return sum;
   }
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int ans=sumOfDigit(nums[i]);
            nums[i]=ans;
        }
        for(int i=0;i<nums.length;i++){
           min=Math.min(min,nums[i]);
        }
        return min;
    }
}