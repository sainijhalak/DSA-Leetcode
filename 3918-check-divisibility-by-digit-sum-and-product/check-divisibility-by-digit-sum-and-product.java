class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int num=n;
        while(num>0){
            int r=num%10;
            sum=sum+r;
            pro=pro*r;
            num=num/10;
        }
        int s=sum+pro;
        if(n%s==0){
            return true;
        }
        return false;
    }
}