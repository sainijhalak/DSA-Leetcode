class Solution {
    int minnkl(int[] nums,int start){
    int min=Integer.MAX_VALUE;
    for(int i=start;i<nums.length;i++){
        min=Math.min(nums[i],min);
    }
    return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int max=0;
         int ans=-1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            int min=minnkl(nums,i);
            if(min==Integer.MAX_VALUE) continue;
            if((max-min)<=k){
               ans=i;
               break;
            }
            
        }
        return ans;
    }
}