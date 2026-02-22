class Solution {
    public int maxDistinct(String s) {
        int []res=new int[256];
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)]++;
        }
        int count=0;
        for(int i=0;i<res.length;i++){
            if(res[i]!=0){
                count++;
            }
        }
        return count;
    }
}