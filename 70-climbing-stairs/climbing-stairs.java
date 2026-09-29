class Solution {
    static Integer []dp;
    int fact(int n){
         if(n==1){
            return dp[n]=1;
        }
        if(n==2){
            return dp[n]=2;
        }
        if(dp[n]!=null) return dp[n];
    return dp[n]= fact(n-1)+fact(n-2);
    }
    public int climbStairs(int n) {
       dp=new Integer[n+1];
    return fact(n);
    }
}