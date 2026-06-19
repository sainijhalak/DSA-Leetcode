class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int[]ans=new int[gain.length+1];
        ans[0]=0;
        int j=1;
        for(int i=0;i<gain.length;i++){
            ans[j]=ans[i]+gain[i];
            max=Math.max(ans[j],max);
            j++;
        }
        return max;
    }
}