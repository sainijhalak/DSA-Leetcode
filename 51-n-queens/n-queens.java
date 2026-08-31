class Solution {
static boolean isValid1(char [][]arr,int i ,int j ,int n){
        if(i>=n || j>=n || i<0 ||j<0) return true;
        if(arr[i][j]=='Q') return false;
        return isValid1(arr,i-1,j-1,n);
    }
    static boolean isValid2(char [][]arr,int i ,int j, int n){
        if(i>=n || j>=n || i<0 ||j<0) return true;
        if(arr[i][j]=='Q') return false;
        return isValid2(arr,i-1,j+1,n);
    }
    static boolean isValid3(char [][]arr,int i ,int j, int n){
        if(i>=n || j>=n || i<0 ||j<0) return true;
        if(arr[i][j]=='Q') return false;
        return isValid3(arr,i-1,j,n);
    }

    void queen(char[][]arr,int i,int j,int n,List<List<String>> list){
        if(i==n){
            List<String> y=new ArrayList<>();
            for(int l=0;l<n;l++){
                StringBuilder sb=new StringBuilder();
                for(int m=0;m<n;m++){
                    if(arr[l][m]!='Q'){
                        sb.append('.');
                    }
                    else sb.append('Q');
                }
                y.add(sb.toString());
            }
            list.add(y);
            return;
        }
        if(i>n || i<0 || j>n || i<0) return;
        for(int m=0;m<n;m++){
             if(isValid1(arr,i-1,m-1,n) && (isValid2(arr,i-1,m+1,n)) && (isValid3(arr,i-1,m,n))){
                arr[i][m]='Q';
            }
            else continue;
            queen(arr,i+1,m,n,list);
            arr[i][m]=' ';
        }
    
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        List<List<String>> list=new ArrayList<>();
        queen(arr,0,0,n,list);
        return list;
    }
}