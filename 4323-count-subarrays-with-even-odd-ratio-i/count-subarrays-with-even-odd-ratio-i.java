class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int count=0;
        for(int i=0;i<nums.length;i++){
             int x=0;
        int y=0;

            if(nums[i]%2==0) x++;
            else y++;

            if(y>0 && (x*b<=a*y)) count++;
             for(int j=i+1;j<nums.length;j++){
                       if(nums[j]%2==0) x++;
            else y++;
             if(y>0 && (x*b<=a*y)) count++;
             }
        }
        return count;
    }
}