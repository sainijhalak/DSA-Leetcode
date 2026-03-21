class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
       String[]arr=sentence.trim().split("\\s+");
       for(int i=0;i<arr.length;i++){
         int j=0;
        String s=arr[i];
        for(int k=0;k<searchWord.length();k++){
            if(s.length()<searchWord.length()) break;
            if(s.charAt(k)==searchWord.charAt(j)){
                j++;
            }
        }
        if(j==searchWord.length()) return i+1;
       }
       return -1;
    }
}