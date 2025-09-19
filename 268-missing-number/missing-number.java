class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
       int a=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
             
if(nums[i]==a){
    a++;
}
else{
    return a;
}
        }
        return a;
    }
}