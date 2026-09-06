class Solution {
    static Integer[][]dp;

    static int counter(String s,String t,int i,int n){
        if(n==t.length()) {
            return 1;
        }

        if(i>=s.length()) return 0;
        if(dp[i][n]!=null) return dp[i][n];
        if(s.charAt(i)==t.charAt(n)){
            return dp[i][n]=counter(s,t,i+1,n+1)+counter(s,t,i+1,n);
        }
        else return dp[i][n]=counter(s,t,i+1,n);
    }
    public int numDistinct(String s, String t) {
      dp=new Integer[s.length()+1][t.length()+1];
        int c=counter(s,t,0,0);
     return c;
    }
}