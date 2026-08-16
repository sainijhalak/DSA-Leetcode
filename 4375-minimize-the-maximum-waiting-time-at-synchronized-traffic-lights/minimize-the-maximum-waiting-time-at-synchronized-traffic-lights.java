class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int j=lights.length-1;
        Arrays.sort(lights);
        int ans=0;
        for(int i=0;i<arrivalTime.length;i++){
            int r=arrivalTime[i]%period;
             if(r>=lights[j]){
            ans=Math.max(ans,period-r);
           } 
        }
        return ans;
    }
}