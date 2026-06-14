class Solution {
    public boolean checkGoodInteger(int n) {
        long digitSum=0;
        long squareSum=0;
        int num=n;
        while(num>0){
            int r=num%10;
            digitSum=digitSum+r;
            squareSum=squareSum+(r*r);
            num=num/10;
        }
        if((squareSum-digitSum)>=50) return true;
        return false;
    }
}