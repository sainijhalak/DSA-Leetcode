class Solution {
    public int slowfast(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r*r;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
       int slow=n;
       int fast=n;
       while(fast!=1){
slow=slowfast(slow);
fast =slowfast(fast);
fast =slowfast(fast);
if(slow==fast && slow!=1){
    return false;
}

       }
       return true;
    }
}
