class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int t;
       
    Arrays.sort(nums);
    for(int i=0;i<n;i++){
        t=nums[i];
        int count=0;
        for(int j=0;j<n;j++){
if(nums[j]==t){
    count++;
}
        }
        if(count==1){
            return nums[i];
        }
    }
    return 0;

    }
}