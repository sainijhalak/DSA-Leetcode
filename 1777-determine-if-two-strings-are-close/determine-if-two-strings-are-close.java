class Solution {
    public boolean closeStrings(String word1, String word2) {
        int s1=word1.length();
        int s2=word2.length();
        int [] w1=new int[256];
         int [] w2=new int[256];
         if(s1!=s2){
            return false;
         }
         for(int i=0;i<s1;i++){
            w1[word1.charAt(i)]++;
              w2[word2.charAt(i)]++;
         }
         for(int i=0;i<w1.length;i++){
            if(w1[i]==0 && w2[i]!=0){
                return false;
            }
            else if(w1[i]!=0 && w2[i]==0 ){
                return false;
            }
            else{
                continue;
            }
         }
         Arrays.sort(w1);
         Arrays.sort(w2);
         for(int i=0;i<w2.length;i++){
            if(w1[i]!=w2[i]){
                return false;
            }
         }

         return true;
    }
}