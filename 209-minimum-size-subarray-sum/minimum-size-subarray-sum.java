class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    //     int low=0;
    //     int high=0;
    //     int sum=0;
    //     int res=Integer.MAX_VALUE;
    //     while(high<nums.length){
    //         sum=sum+nums[high];
    //         while(sum>=target){
    //         int len=high-low+1;
    //             res=Math.min(res,len);
    //             sum=sum-nums[low];
    //             low++;
    //         }
    //         high++;
    //     }
    //     if(res==Integer.MAX_VALUE){
    //         return 0;}
    //    return res;
    int low=0;
    int sum=0;
    int res=Integer.MAX_VALUE;
    for(int high=0;high<nums.length;high++){
        sum=sum+nums[high];
        while(sum>=target){
            res=Math.min(res,high-low+1);
            sum=sum-nums[low];
            low++;
        }

    }
    res= (res==Integer.MAX_VALUE)?0:res;
    return res;
        
    }
}