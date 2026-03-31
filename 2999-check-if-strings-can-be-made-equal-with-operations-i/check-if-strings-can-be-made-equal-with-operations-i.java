class Solution {
    public boolean canBeEqual(String s1, String s2) {
        StringBuilder sb=new StringBuilder(s1);
       for(int i=0;i<sb.length();i++){
        for(int j=0;j<sb.length();j++){
   if(Math.abs(i-j)==2){
    char temp=sb.charAt(i);
    sb.setCharAt(i,sb.charAt(j));
    sb.setCharAt(j,temp);
    if(sb.toString().equals(s2)) return true;
}
        }
       }
       return false;

    }
}