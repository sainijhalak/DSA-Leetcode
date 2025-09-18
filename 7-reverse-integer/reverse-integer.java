class Solution {
    public int reverse(int x) {
        int num=x;
        int s=0;
        while(num>0||num<0){
            int r=num%10;
           
            if (s > Integer.MAX_VALUE / 10 || (s == Integer.MAX_VALUE / 10 && r > 7)) return 0;
if (s < Integer.MIN_VALUE / 10 || (s == Integer.MIN_VALUE / 10 && r < -8)) return 0;

 s=s*10+r;
             num=num/10;
        }
        return s;
    }
}