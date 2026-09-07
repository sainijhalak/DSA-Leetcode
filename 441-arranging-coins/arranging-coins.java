class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int c=0;
        while(n>=0){
        if(n<i) break;
         n=n-i;
         c++;
         i++;
        }
        return c;
    }
}