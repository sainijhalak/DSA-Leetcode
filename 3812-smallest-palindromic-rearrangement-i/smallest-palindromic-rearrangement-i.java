class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()<=1) return s;
        char [] ans=s.toCharArray();
         int e=s.length()/2;
         Arrays.sort(ans,0,e);
         int i=0;
         int j=ans.length-1;
         while(i<j){
            ans[j]=ans[i];
            i++;
            j--;
         }

        String a = new String(ans);
         return a;
    }
}