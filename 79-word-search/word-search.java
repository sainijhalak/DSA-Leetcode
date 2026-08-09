class Solution {
    boolean dfs(char [][]board,int i,int j,int[][]vis,String word,int idx){
         if(idx==word.length()) return true;
         if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(idx) || vis[i][j]==1){
            return false;
         }
         vis[i][j]=1;
         boolean found=dfs(board,i+1,j,vis,word,idx+1) || 
         dfs(board,i-1,j,vis,word,idx+1) || dfs(board,i,j+1,vis,word,idx+1) || dfs(board,i,j-1,vis,word,idx+1);

          vis[i][j]=0;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        boolean ans=false;
        int n=board.length;
        int m=board[0].length;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){

                    ans=dfs(board,i,j,vis,word,0);

                    if(ans==true) return true;
                }
            }
        }
        return ans;
    }
}