class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i=0;
        int j=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int [][]vis=new int[m][n];
        int l=0;
        List<Integer>list=new ArrayList<>();
        while(i<matrix.length && j<matrix[0].length){
            while(j<n){
                if(vis[i][j]==0){
                    list.add(matrix[i][j]);
                    vis[i][j]=1;
                }
                j++;
            }
            j--;
            while(i<m){
                if(vis[i][j]==0){
                    list.add(matrix[i][j]);
                    vis[i][j]=1;
                }
                i++;
            }
            i--;
            while(j>=l){
                if(vis[i][j]==0){
                    list.add(matrix[i][j]);
                    vis[i][j]=1;
                }
                j--;
            }
            j++;
            while(i>=l){
                if(vis[i][j]==0){
                    list.add(matrix[i][j]);
                    vis[i][j]=1;
                }
                i--;
            }
            i++;

            i++;
            j++;
            m--;
            n--;
            l++;
        }
        return list;
    }
}