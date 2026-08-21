class Solution {
    static int ans;
    void dfs(int[][]grid,int[][]vis,int sum,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || vis[i][j]==1 || grid[i][j]==0) return;
        if((sum+grid[i][j])>ans){
            ans=sum+grid[i][j];
        }
        vis[i][j]=1;
        dfs(grid,vis,sum+grid[i][j],i+1,j);
        dfs(grid,vis,sum+grid[i][j],i-1,j);
        dfs(grid,vis,sum+grid[i][j],i,j+1);
        dfs(grid,vis,sum+grid[i][j],i,j-1);
        vis[i][j]=0;
    }
    public int getMaximumGold(int[][] grid) {
        ans=0;
        int[][]vis=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    dfs(grid,vis,0,i,j);
                }
            }
        }
        return ans;
    }
}