class Solution {
    public int[] countBits(int n) {
        int mask=0;
        int i=0;
    int [] arr=new int[n+1];
        while(i<=n){
             int num=i;
int count=0;
             while(num>0){
                
                if(((num&1)==1)){
                    count++;
                }
num=num>>1;

             }
            arr[i]=count;
            i++;
        }
        return arr;
    }
}