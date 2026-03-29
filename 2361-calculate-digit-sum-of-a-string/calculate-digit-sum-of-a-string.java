class Solution {
    public String digitSum(String s, int k) {
      while(s.length()>k) { 
          String res="";
            int i=0;
        while(i<s.length()){
             String ans="";
            if(s.length()-i<k) {ans=ans+s.substring(i,s.length());
 
            }
            else { ans=ans+s.substring(i,i+k);}
            int c=0;
            for(int j=0;j<ans.length();j++){
                   c=c+(ans.charAt(j)-'0');
            }
            res=res+String.valueOf(c);
            i=i+k;
          
        }
        s=res;}
        return s;
    }
}