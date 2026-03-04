class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] res=new int[26];
        for(int i=0;i<sentence.length();i++){
            int sc=sentence.charAt(i);
            res[sc-'a']++;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]<=0){
                return false;
            }
        }
        return true;
    }
}