class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int ans=Integer.MAX_VALUE;
        int min=0;
        for(int i=0;i<drones.length;i++){
            int a=Math.abs(drones[i][0]-target[0]);
            int b=Math.abs(drones[i][1]-target[1]);
            if((a+b)<=drones[i][2]){
               if(ans>(a+b)){
                ans=(a+b);
                min=i;
               }
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return min;
    }
}