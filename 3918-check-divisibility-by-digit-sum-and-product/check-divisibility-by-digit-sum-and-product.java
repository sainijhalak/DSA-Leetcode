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
        
        if(n%(sum+pro)==0) return true;
        return false;
    }
}