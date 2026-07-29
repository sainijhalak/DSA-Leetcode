class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int i=0;
        int j=1;
        int min=prices[i];
        int ans=0;
        while(i<prices.length && j<prices.length){
            if(prices[j]<min){
                i=j;
                min=prices[j];
            }
            else{
              int c=prices[j]-min;
              ans=Math.max(ans,c);
            }
             j++;
        }
        return ans;
    }
}