class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
           int k=0;
           int j=image[0].length-1;
           while(k<j){
            int temp=image[i][k];
            image[i][k]=image[i][j];
            image[i][j]=temp;
            k++;
            j--;           }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                     image[i][j]=0;
                }
            }
        }
        return image;
    }
}