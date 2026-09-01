class Solution {
    static int ways;
    boolean isValid1(char[][]arr,int i,int j,int n){
        if(i>=n || j>=n || i<0 || j<0) return true;
        if(arr[i][j]=='Q') return false;
        return isValid1(arr,i-1,j-1,n);
    }
     boolean isValid2(char[][]arr,int i,int j,int n){
        if(i>=n || j>=n || i<0 || j<0) return true;
        if(arr[i][j]=='Q') return false;
        return isValid2(arr,i-1,j,n);
    }
     boolean isValid3(char[][]arr,int i,int j,int n){
        if(i>=n || j>=n  || i<0 || j<0) return true;
        if(arr[i][j]=='Q') return false;
        return isValid3(arr,i-1,j+1,n);
    }
    void queen(char[][]arr,int i,int j,int n){
    if(i==n){
        ways++;
        return;
    }
    if(i>n || j>n || i<0 || j<0) return;

    for(int m=0;m<n;m++){
        if(isValid1(arr,i-1,m-1,n) && isValid2(arr,i-1,m,n) && isValid3(arr,i-1,m+1,n)){
            arr[i][m]='Q';
        }
        else continue;
        queen(arr,i+1,m,n);
         arr[i][m]=' ';
    }

    }
    public int totalNQueens(int n) {
    ways=0;
    char[][] arr=new char[n][n];
    queen(arr,0,0,n);
    return ways;
    }
}