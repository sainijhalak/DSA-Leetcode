class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        for(int n:nums){
            sum1=sum1+n;
    
        }
        int sum2=0;
        for(int n :nums){{
            int r=0;
            if(n>=10){
                while(n>0){
                int a=n%10;
                
                r=r+a;
                n=n/10;
                }
                sum2=sum2+r;
            }
            else{
                sum2=sum2+n;
            }
        }}
        return sum1-sum2;
    }
}