class Solution {
    int Kayeth(int n,int k){
        if(n==1 && k==1) return 0;
        int t=(int) Math.pow(2,n-1);
        int mid=t/2;
        if(k>mid){
            return 1-Kayeth(n-1,k-mid);
        }
        return Kayeth(n-1,k);
    }
    public int kthGrammar(int n, int k) {
        int ans=Kayeth(n,k);
        return ans;
    }
}