class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        int i=1;
        int d=5;
        while(true){
            count=count+(n/d);
            if((n/d)==0) break;
            d=d*5;
            i++;
        }
        return count;
    }
}