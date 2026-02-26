class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String s=sentences[i];
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j) == ' '){
                    count++;
                }
            }
            count++;
            max=Math.max(max,count);
        }
        return max;
    }
}