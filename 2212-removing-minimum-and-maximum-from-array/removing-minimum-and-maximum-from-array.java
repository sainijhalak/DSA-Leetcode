class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int idxmax=0;
        int idxmin=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                idxmax=i;
            }
            if(nums[i]<min){
                min=nums[i];
                idxmin=i;
            }
        }
        int l=Math.max(idxmax,idxmin)+1;
        int m=nums.length-Math.min(idxmax,idxmin);
        int n=(Math.min(idxmax,idxmin)+1)+(nums.length-Math.max(idxmax,idxmin));
        return Math.min(l,Math.min(n,m));
    }
}