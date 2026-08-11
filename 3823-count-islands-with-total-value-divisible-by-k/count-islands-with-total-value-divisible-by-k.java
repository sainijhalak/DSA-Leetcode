class Solution {
    static int count;
    static long sum;
    void dfs(int[][] grid,int i,int j){
        if(i>=grid.length || i<0 || j<0 || j>=grid[0].length || grid[i][j]==0) return;
        sum=sum+grid[i][j];
         grid[i][j]=0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    public int countIslands(int[][] grid, int k) {
        sum=0;
        count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                   dfs(grid,i,j);
                   if(sum==0) continue;
                   if(sum%k==0) count++;
                   sum=0;
                }
            }
        }
        return count;
    }
}