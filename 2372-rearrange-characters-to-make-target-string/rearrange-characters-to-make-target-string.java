class Solution {
    public int rearrangeCharacters(String s, String target) {
        
        int[]ans=new int[26];
       
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i)-'a']++;
        }
        int count=0;
        boolean flag=true;;
        while(flag){
           for(int i=0;i<target.length();i++){
     if(ans[target.charAt(i)-'a']<1){
        flag=false;
        break;
     }
     else{
        ans[target.charAt(i)-'a']--;
        
     }
           }
           count++;
        }
        return count-1;
    }
}