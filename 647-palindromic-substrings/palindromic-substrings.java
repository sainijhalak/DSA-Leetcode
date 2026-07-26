class Solution {
    boolean check(String ans){
        int k=0;
        int m=ans.length()-1;
        while(k<m){
            if(ans.charAt(k)!=ans.charAt(m)) return false;
            k++;
            m--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            String ans="";
            for(int j=i;j<s.length();j++){
                   ans=ans+s.charAt(j);
                   if(check(ans)) count++;
            }
        }
        return count;
    }
}