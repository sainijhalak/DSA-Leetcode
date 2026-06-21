class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum=0;
        int count=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
                 sum=sum+costs[i];
                    if(sum>coins) break;
                    count++;
        }
        return count;
    }
}