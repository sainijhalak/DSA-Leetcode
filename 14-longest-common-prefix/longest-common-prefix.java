class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        String n=strs[0];
          String prev="";
        for(int i=0;i<n.length();i++){
            ans=ans+n.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].indexOf(ans)!=0) return prev;
            }
            prev=ans;
        }
        return prev;
    }
}