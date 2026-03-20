class Solution {
    public String reversePrefix(String s, int k) {
        int i=0;
        int j=k-1;
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