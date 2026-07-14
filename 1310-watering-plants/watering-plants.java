class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int step=0;
        int n=capacity;
        for(int i=0;i<plants.length;i++){
            if(capacity>=plants[i]){
                capacity=capacity-plants[i];
                step++;
            }
            else if(capacity<plants[i]){
                step=step+i;
                step=step+i+1;
                capacity=n;
                capacity=capacity-plants[i];
            }
        }
        return step;
    }
}