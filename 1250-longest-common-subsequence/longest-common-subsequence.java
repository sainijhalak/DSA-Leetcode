class Solution {
    static Integer [][]dp;
    static int  lcs(String t1,String t2,int i,int j){
        if(i==t1.length() || j==t2.length()) return 0;
         if(dp[i][j]!=null) return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j)) return dp[i][j]=1+lcs(t1,t2,i+1,j+1);
        else{
            return dp[i][j]=Math.max(lcs(t1,t2,i+1,j),lcs(t1,t2,i,j+1));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new Integer[text1.length()+1][text2.length()+1];
        int ans=lcs(text1,text2,0,0);
        return ans;
    }
}