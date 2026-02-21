class Solution {

    static int countSetBit(int n){
        int c = 0;
        while(n > 0){
            if((n & 1) == 1){
                c++;
            }
            n = n >> 1;
        }
        return c;
    }

    static boolean prime(int a){
        if(a < 2) return false;
        for(int i = 2; i * i <= a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++){
            int ans = countSetBit(i);
            if(prime(ans)){
                count++;
            }
        }
        return count;
    }
}