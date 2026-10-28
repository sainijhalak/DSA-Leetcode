class Solution {
    static Integer [][][] dp;

    int frid(int[][]grid,int i,int j,int x){
        if(i>=grid.length || j>=grid[0].length) return Integer.MAX_VALUE;

        x = x ^ grid[i][j];

        if(i==grid.length-1 && j==grid[0].length-1){
            return x;
        }

        if(dp[i][j][x] != null) return dp[i][j][x];

        return dp[i][j][x] = Math.min(
            frid(grid,i+1,j,x),
            frid(grid,i,j+1,x)
        );
    }

    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        dp = new Integer[m][n][1024];

        return frid(grid,0,0,0);
    }
}