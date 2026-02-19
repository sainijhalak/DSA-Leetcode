class Solution {
    public int findMiddleIndex(int[] nums) {
    
    int left=0;
    int ts=0;
    
    for(int i=0;i<nums.length;i++){
        ts=ts+nums[i];
    }
    int r=ts-left-nums[0];
        if(left==r){
            return 0;
        }
    for(int i=1;i<nums.length;i++){
        left+=nums[i-1];
        int right=ts-left-nums[i];
        if(left==right){
            return i;
        }
    }
    return -1;
    }
}
    