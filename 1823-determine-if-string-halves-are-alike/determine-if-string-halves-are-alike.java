class Solution {
    static Boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        s=s.toLowerCase();
        int mid=n/2;
        int n1=0;
        int n2=0;
        int i=0;
        int j=s.length()-1;
        while(i<mid && j>=mid){
            if(isVowel(s.charAt(i))){
                n1++;
            }
            if(isVowel(s.charAt(j))){
                n2++;
            }
            i++;
            j--;
        }
        if(n1==n2) return true;
        return false;
    }
}