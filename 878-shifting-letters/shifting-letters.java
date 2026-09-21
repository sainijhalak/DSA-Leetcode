class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        for(int i=shifts.length-2; i >= 0; i--){
            shifts[i] = (shifts[i] + shifts[i+1]) % 26; 
        }
        int j=0;
        String ans="";
        for(int i=0;i<shifts.length;i++){
           int n=shifts[i];
           int c=s.charAt(j)-'a';
           int m=(c+n)%26;
           char a=(char)(m+'a');
           ans=ans+a;
            j++;
        }
        return ans;
    }
}