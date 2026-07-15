class Solution {
    public int gcdOfOddEvenSums(int n) {
        int so=0;
        int se=0;
        n=n*2;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                se=se+i;
            }
            else{
                so=so+i;
            }
        }
        int min=Math.min(se,so);
        for(int i=min;i>=0;i--){
            if(se%i==0 && so%i==0) return i;
        }
        return 0;
    }
}