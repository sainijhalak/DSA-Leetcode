class Solution {
    public int bitwiseComplement(int n) {
        int m=1;
        if(n==0) return 1;
        while(m<=n){
            n=n^m;
            m=m<<1;
        }
        return n;
    }
}