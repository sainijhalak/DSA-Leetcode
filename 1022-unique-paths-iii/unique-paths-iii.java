class Solution {
    static int count;
    void dfs(int i,int j,int[][]vis,int [][]grid,int k){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || vis[i][j]==1 || grid[i][j]==-1) return;

        if(grid[i][j]==2 ){
            if(k==0){
                  count++;
            return;
            }
          
        }
        vis[i][j]=1;
        if(grid[i][j]==0) k--;
        dfs(i+1,j,vis,grid,k);
        dfs(i-1,j,vis,grid,k);
        dfs(i,j-1,vis,grid,k);
        dfs(i,j+1,vis,grid,k);
        vis[i][j]=0;
        k++;
    }
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        count=0;
        int n=grid[0].length;
        int[][]vis=new int[m][n];
          int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0) k++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int c=k;
                      dfs(i,j,vis,grid,c);
                }
            }
        }
        
        return count;
    }
}