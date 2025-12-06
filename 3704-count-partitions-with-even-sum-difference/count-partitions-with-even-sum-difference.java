class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int sum1=0;
            int sum2=0;
            for(int j=0;j<=i;j++){
sum1=sum1+nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                sum2=sum2 +nums[k];
            }
            int ans=sum1-sum2;
            if(ans%2==0){
                count++;
            }
        }
        return count;
    }
}