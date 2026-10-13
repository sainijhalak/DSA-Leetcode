class Solution {
    static Integer [][]dp;

    int find(int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=null) return dp[i][j];
        if(i>=m || j>=n ) return 0; 
       return dp[i][j]= find(i+1,j,m,n)+find(i,j+1,m,n);
    }
    public int uniquePaths(int m, int n) {
        dp=new Integer[m+1][n+1];
        return find(0,0,m,n);
    }
}