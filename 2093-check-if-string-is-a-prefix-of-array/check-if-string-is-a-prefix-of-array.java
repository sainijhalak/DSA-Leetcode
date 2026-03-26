class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String ans="";
        Boolean flag=false;
        for(int i=0;i<words.length;i++){
ans=ans+words[i];
if(s.equals(ans)){
    flag=true;
    break;
}
        }
        return flag;
    }
}