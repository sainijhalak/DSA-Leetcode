class Solution {
    public int[] sumZero(int n) {
        int []res=new int[n];
        int j=0;
        if(n%2==0){
            j=1;
        }
        if(n%2!=0){
            res[0]=0;
             for(int i=1;i<n-1;i=i+2){
        
res[i]=i;
res[i+1]=-i;
       }
        }
        else{

             for(int i=0;i<n;i=i+2){
       j=i+1;
res[i]=j;
res[i+1]=-j;
       }
        }
      
       return res;
    }
}