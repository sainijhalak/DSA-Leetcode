class Solution {
   static Boolean check(String s,String pref){
    int j=0;
    if(s.length()<pref.length()) return false;
    for(int i=0;i<pref.length();i++){
        if(s.charAt(i)==pref.charAt(j)){
            j++;
        }
        else{
            break;
        }
    }
    if(j==pref.length()) return true;
    return false;
   }
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
           if(check(words[i],pref)){
            c++;
           }
           
        }
        return c;
    }
}