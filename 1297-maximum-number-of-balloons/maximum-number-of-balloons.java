class Solution {
    public int maxNumberOfBalloons(String text) {
        int[]ans=new int[26];
        String s ="balloon";
        for(int i=0;i<text.length();i++){
            ans[text.charAt(i)-'a']++;
        }
        int count=0;
        boolean flag=true;;
        while(flag){
           for(int i=0;i<s.length();i++){
     if(ans[s.charAt(i)-'a']<1){
        flag=false;
        break;
     }
     else{
        ans[s.charAt(i)-'a']--;
        
     }
           }
           count++;
        }
        return count-1;
    }
}