class Solution {
    public boolean hasAlternatingBits(int n) {
        int num=n;
        num=num>>1;
        int ans=n^num;
        if((ans & (ans+1))==0) return true;
        return false;
    }
}