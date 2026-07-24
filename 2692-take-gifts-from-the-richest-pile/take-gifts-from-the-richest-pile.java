class Solution {
   int maxVerstappen(int[] gifts) {
        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int j = 0; j < gifts.length; j++) {
            if (gifts[j] > max) {
                max = gifts[j];
                idx = j;
            }
        }

        return idx;
    }
    public long pickGifts(int[] gifts, int k) {
        int i=0;
        while(i<k){
           int index=maxVerstappen(gifts);
           
            gifts[index] = (int) Math.sqrt(gifts[index]);
           
           i++;
        }
        long sum=0;
        for(int o=0;o<gifts.length;o++){
            sum=sum+gifts[o];
        }
        return sum;
    }
}