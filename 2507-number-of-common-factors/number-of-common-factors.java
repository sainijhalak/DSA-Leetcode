class Solution {
    public int commonFactors(int a, int b) {
        int i=1;
        int count=0;
        int max=Math.max(a,b);
        while(i<=max){
            if(a%i==0 && b%i==0){
count++;

            }
            i++;
        }
         return count;
       
    }
}