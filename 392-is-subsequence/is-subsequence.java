class Solution {
    public boolean isSubsequence(String s, String t) {
        int prev = -1;

        for(int i = 0; i < s.length(); i++){
            int idx = t.indexOf(s.charAt(i), prev + 1);

            if(idx == -1){
                return false;
            }

            prev = idx;
        }

        return true;
    }
}