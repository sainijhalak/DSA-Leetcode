class Solution {
    static boolean check(int b,int s){
        int sum=0;
        while(b>0){
            sum=sum+(b%10);
            b=b/10;
        }
        if(sum==s) return true;
        return false;
    }

    public int largestInteger(int n, int s) {
        if(s==0) return 0;
        int start=(int)Math.pow(10,n-1);
        int end=start*10;
        for(int i=end-1;i>=start;i--){
          if( check(i,s)) return i;;
        }
        return -1;
    }
}