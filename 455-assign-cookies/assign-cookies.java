class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=g.length-1;
        int j=s.length-1;
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i>=0 && j>=0){
            if(g[i]<=s[j]){ 
                count++;
            i--;
            j--;
            }
            else{
                i--;
            }
        }
        return count;
    }
}