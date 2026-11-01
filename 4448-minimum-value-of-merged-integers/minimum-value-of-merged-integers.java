class Solution {
    public int minMergedInteger(int[] nums) {
        int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length-1;i=i+2){
        StringBuilder sb=new StringBuilder();
        sb.append(String.valueOf(nums[i]));
        sb.append(String.valueOf(nums[i+1]));
        min=Math.min(min,Integer.valueOf(sb.toString()));
       }
       return min;
    }
}