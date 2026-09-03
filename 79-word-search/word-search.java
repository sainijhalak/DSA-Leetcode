class Solution {
    static boolean ans;
    void wordKoKroSearch(char[][]board,int[][]vis,String word,int i,int j,int k){
        if(k==word.length()) {
            ans=true;
            return;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || vis[i][j]==1 || board[i][j]!=word.charAt(k)) return;

        vis[i][j]=1;
        wordKoKroSearch(board,vis,word,i-1,j,k+1);
        wordKoKroSearch(board,vis,word,i+1,j,k+1);
        wordKoKroSearch(board,vis,word,i,j-1,k+1);
        wordKoKroSearch(board,vis,word,i,j+1,k+1);
        vis[i][j]=0;
    }
    public boolean exist(char[][] board, String word) {
        ans=false;
        int n=board.length;
        int m=board[0].length;
        int[][]vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    wordKoKroSearch(board,vis,word,i,j,0);
                }
            }
        }
        return ans;
    }
}