class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count=1;
        int i=1;
        int max=1;
        if(nums.length==1) return 1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]+1){
                count++;
            }
            else if(nums[i]==nums[i-1]){ i++;
            continue;}
            else{

                count=1;
            }
             max=Math.max(count,max);
            i++;
        }
     
        return max;
    }
}