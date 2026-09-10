class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) f++;
            else if(bills[i]==10){
                if(f==0) return false;
                f--;
                t++;
            }
            else{
                if(t>0){
                    t--;
                    if(f==0) return false;
                    
                    f--;
                }
                else{
                    if(f<3) return false;
                    f=f-3;
                }
            }
        }
        return true;
    }
}