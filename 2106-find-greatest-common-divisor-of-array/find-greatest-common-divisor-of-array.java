class Solution {
    public int findGCD(int[] nums) {
        int min=1001;
        int max=0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        while(true){
            int k=max;
            max=min;
            min=k%min;
            if(min==0) return max;
        }
    }
}