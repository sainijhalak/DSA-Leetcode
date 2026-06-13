class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int sum=0;
            for(int j=0;j<s.length();j++){
              sum=sum+weights[s.charAt(j)-'a'];
            }
            sum=sum%26;
            char a = (char)('a' +25-sum);
            ans=ans+a;
        }
        return ans;
    }
}