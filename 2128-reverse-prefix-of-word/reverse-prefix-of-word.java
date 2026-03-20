class Solution {
    public String reversePrefix(String word, char ch) {
        String s=word;
        int i=0;
        int j=s.indexOf(ch);
        StringBuilder sb=new StringBuilder(s);
        while(i<j){
char temp=sb.charAt(i);
sb.setCharAt(i,sb.charAt(j));
sb.setCharAt(j,temp);
i++;
j--;
        }
        return sb.toString();
    }
}