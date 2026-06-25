class Solution {
    public int minLengthAfterRemovals(String s) {
        int a=0;
        int b=0;
        int ans=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') a++;
            else{
                b++;
            }
        }
        if(a>=b){
        ans=ans-2*(b);
        }
        else if(a<=b){
            ans=ans-2*(a);
        }
        return ans;
    }
}