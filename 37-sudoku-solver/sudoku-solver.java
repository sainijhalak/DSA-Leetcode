class Solution {
    boolean check(char[][]ans,int i,int j,char a){
        boolean a1=true;

        for(int k=0;k<9;k++){
            if(k==i) continue;
            if(ans[k][j]==a){ a1=false;
            break;}
        }
         for(int k=0;k<9;k++){
            if(k==j) continue;
            if(ans[i][k]==a) {a1=false;
            break;}
        }
        int s1=(i/3)*3;
        int s2=(j/3)*3;
        for(int l=s1;l<s1+3;l++){
            for(int m=s2;m<s2+3;m++){
                if(l==i && m==j) continue;
                if(ans[l][m]==a){ 
                    a1=false;
                    break;}
            }
        }
        return a1;
    }
    void solvingSudoku(char[][]ans,int i,int j,char[][]board){
        if(i==board.length) {
         for(int o=0;o<board.length;o++){
            for(int p=0;p<board.length;p++){
                board[o][p]=ans[o][p];
            }
        }
        return;
        }

        if(j==board.length) {
            solvingSudoku(ans,i+1,0,board);
            return;
            }
            if(ans[i][j]!='.'){
            solvingSudoku(ans,i,j+1,board);
            return;
        }
            for(char m='1';m<='9';m++){
                if(check(ans,i,j,m)){
                    ans[i][j]=m;
                      solvingSudoku(ans,i,j+1,board);
                    ans[i][j]='.';
                }
            }
    }
    public void solveSudoku(char[][] board) {
        char[][]ans=new char[board.length][board.length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                ans[i][j]=board[i][j];
            }
        }
        solvingSudoku(ans,0,0,board);
        
    }
}