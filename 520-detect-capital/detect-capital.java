class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        if(word== word.toUpperCase()) return true;
        if(word==word.toLowerCase()) return true;
        String s=word.substring(1,n);
        if(Character.isUpperCase(word.charAt(0)) && s==s.toLowerCase() ) return true;
        return false;
    }
}