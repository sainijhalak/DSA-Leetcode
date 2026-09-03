class Solution {
    static Boolean [][]dp;
    static boolean findSum(int []nums,int s1,int n){
        if(s1==0) return true;
        if(s1<0 ||n==0) return false;
        if(dp[n][s1]!=null) return dp[n][s1];
        return dp[n][s1]=findSum(nums,s1-nums[n],n-1)||findSum(nums,s1,n-1);
    }
    public boolean canPartition(int[] nums) {
          int s1=0;
        for(int i=0;i<nums.length;i++){
            s1=s1+nums[i];
        }
        dp=new Boolean [nums.length+1][s1+1];
        if(s1%2!=0) return false;
        
            s1=s1/2;
            boolean ans=findSum(nums,s1,nums.length-1);
           
      return ans;
    }
}