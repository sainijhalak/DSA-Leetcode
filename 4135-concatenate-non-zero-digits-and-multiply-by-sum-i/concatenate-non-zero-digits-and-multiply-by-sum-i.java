class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        int num=0;
        while(n>0){
            int r=n%10;
            if(r!=0){
                num=num*10+r;
                sum=sum+r;
            }
            n=n/10;
        }
        int rev=0;
        while(num>0){
            int r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        return (long)rev*sum;
    }
}