class Solution {
    boolean findNum(int i,int t){
        int mul=1;
        int num=i;
        while(num>0){
          mul=mul*(num%10);
          num=num/10;
        }
        if(mul%t==0){
            return true;
        }
        return false;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            if(findNum(i,t)){
                return i;
            }
        }
        return -1;
    }
}