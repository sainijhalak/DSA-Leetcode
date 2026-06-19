class Solution {
    public String stringHash(String s, int k) {
        String ans="";
        if(s.length()<=1 || k==1) return s;
        int n=s.charAt(0)-'a';
        for(int i=1;i<s.length();i++){
             n=n+s.charAt(i)-'a';
            if((i+1)%k==0){
            
            n=n%26;
            ans=ans+(char)(n+'a');
            n=0;

            }
           
         
        }
        return ans;
    }
}