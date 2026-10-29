class Solution {
    public int[][] generateMatrix(int n) {
     int[][]mat=new int[n][n];
     int[][]vis=new int[n][n];
     int i=0;
     int j=0;
     int c=1;
     int l=0;
     while(i<n && j<n){
        while(j<n){
            if(vis[i][j]!=1){
                 vis[i][j]=1;
                 mat[i][j]=c;
                 c++;
            }
            j++;
        }
        j--;
        while(i<n){
          if(vis[i][j]!=1){
                 vis[i][j]=1;
                 mat[i][j]=c;
                 c++;
            }
        
            i++;
        }
        i--;
        while(j>=l){
           if(vis[i][j]!=1){
                 vis[i][j]=1;
                 mat[i][j]=c;
                 c++;
            }
            j--;
        }
        j++;
        while(i>=l){
             if(vis[i][j]!=1){
                 vis[i][j]=1;
                 mat[i][j]=c;
                 c++;
            }
            i--;
        }
        i++;

        l++;
        n--;
        i++;
        j++;
     }
    return mat;
        
    }
}