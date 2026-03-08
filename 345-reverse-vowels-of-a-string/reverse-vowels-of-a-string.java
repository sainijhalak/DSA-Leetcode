class Solution {
    public boolean isVowel(char c){
    return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
            c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
}
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
if(isVowel(sb.charAt(i)) && isVowel(sb.charAt(j))){
    char t=sb.charAt(i);
    sb.setCharAt(i,sb.charAt(j));
    sb.setCharAt(j,t);
    i++;
    j--;
}
else if(isVowel(sb.charAt(i)) && !isVowel(sb.charAt(j))){
j--;

}
else if(!isVowel(sb.charAt(i)) && isVowel(sb.charAt(j))){
    i++;
}
else{
    i++;
    j--;
}
    
        }
        return sb.toString();
    }
}