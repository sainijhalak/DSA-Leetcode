class Solution {
    static Boolean checkPalindrome(String s){
int j=0;
int k=s.length()-1;
while(j<k){
if(s.charAt(j)!=s.charAt(k)){
    return false;
}
j++;
k--;
}
return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(checkPalindrome(words[i])){
                return words[i];
                
            }
        }
return "";
    }
}