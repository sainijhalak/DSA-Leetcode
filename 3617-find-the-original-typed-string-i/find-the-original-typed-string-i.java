class Solution {
    public int possibleStringCount(String word) {
        int cd=1;
        for(int i=1;i<word.length();i++){
         if(word.charAt(i)!=word.charAt(i-1)) cd++;
        }
        int ans=word.length()-cd+1;
        return ans;
    }
}