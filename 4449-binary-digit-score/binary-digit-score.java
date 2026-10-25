class Solution {
    int countSetBit(int n){
    int m=1;
    int c=0;
    while(n>0){
        if((n & m)==1) c++;
        n=n>>1;
    }
    return c;
    }
    public int calculateScore(int a, int b) {
        int n1=countSetBit(a);
        int n2=countSetBit(b);
        if(n1>=n2){
            return n1*n2;
        }
        return n2/n1;
    }
}