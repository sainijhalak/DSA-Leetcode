class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
           int j=matrix[0].length-1;
            for(int m=0;m<matrix[0].length;m++){
                ans[i][m]=matrix[j][i];
                j--;
            }
        }
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=ans[i][j];
                
            }
        }
    }
}