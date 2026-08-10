class Solution {
    static int island;
    void dfs(int i ,int j,int[][]grid){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==0) return;
    if(grid[i][j]==1){
       island++;
        grid[i][j]=0;
    }
    dfs(i+1,j,grid); 
     dfs(i-1,j,grid); 
      dfs(i,j+1,grid); 
       dfs(i,j-1,grid); 
    }
    public int maxAreaOfIsland(int[][] grid) {
        island=0;
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    island=0;
                    dfs(i,j,grid);
                    max=Math.max(island,max);
                }
            }
        }
        return max;
    }
}