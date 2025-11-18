class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
int cols = matrix[0].length;

        int[][]mat=new int[rows][cols];
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    int r=0;
                    while(r<rows){
                        mat[r][j]=0;
                        r++;
                    }
                    int c=0;
                     while(c<cols){
                        mat[i][c]=0;
                        c++;
                    }
            
                }
            }
        }
          for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = mat[i][j];
            }
        }

    }
}