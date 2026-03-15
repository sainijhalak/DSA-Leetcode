class Solution {
    public char repeatedCharacter(String s) {
        char ans=' ';
        int[]res=new int[26];
                for(int i=0;i<s.length();i++){
res[s.charAt(i)-'a']++;
if(res[s.charAt(i)-'a']>1){
    ans=s.charAt(i);
    break;
}
        }
        return ans;
    }
}