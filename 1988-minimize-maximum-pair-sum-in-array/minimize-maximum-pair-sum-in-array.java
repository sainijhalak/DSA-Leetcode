class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
         int res=Integer.MIN_VALUE;
        while(i<j){
            int sum=nums[i]+nums[j];
          res=Math.max(res,sum);
           i++;
           j--;
        }
        return res;
    }
}