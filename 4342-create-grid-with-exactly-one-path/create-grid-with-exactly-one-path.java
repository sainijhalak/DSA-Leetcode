class Solution {
    static boolean f;
    void path(char[][] mat,int i,int j){
        if(f) return;
      if(i==mat.length-1 && j==mat[0].length-1){
        f=true;
        mat[i][j]='.';
        return;
      }
      if(i>=mat.length || j>=mat[0].length) return;
      mat[i][j]='.';
      path(mat,i,j+1);
      path(mat,i+1,j);
      if(!f){ 
        mat[i][j]='#';
      }
       
    }
    public String[] createGrid(int m, int n) {
        f=false;
        char[][]mat=new char[m][n];
        for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
        mat[i][j] = '#';
    }
}
     path(mat,0,0);
    String[]ans=new String[mat.length];
 for (int i = 0; i < m; i++) {
    StringBuilder sb=new StringBuilder();
    for (int j = 0; j < n; j++) {
        sb.append(mat[i][j]);
    }
    ans[i]=sb.toString();
    }
    return ans;
}
}