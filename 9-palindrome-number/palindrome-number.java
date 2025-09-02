class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int s=0;
        while(num>0){
            int r=num%10;
         s=s*10+r;
            num=num/10;
        }
        if(x==s){
            return true;
        }
        return false;
    }
}