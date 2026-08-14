class Solution {
    int chloChale(int n,int k){
       if(n==1) return 0;
       return (chloChale(n-1,k)+k)%n;
    }
    public int findTheWinner(int n, int k) {
       return chloChale(n,k)+1;
    }
}