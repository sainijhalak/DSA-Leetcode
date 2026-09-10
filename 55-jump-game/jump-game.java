class Solution {
    public boolean canJump(int[] nums) {
        
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(r<i) return false;
         int a=i+nums[i];
         if(r<a){
            r=a;
         }
         if(r>=nums.length-1) return true;
        }
        return false;
    }
}