class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int c=2*n;
        int [] ans =new int [c]; 
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}