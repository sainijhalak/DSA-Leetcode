class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        int ans=0;
        if(nums.length==1) return nums[0];
        while(n!=1){
            n=n-1;
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=(nums[i]+nums[i+1])%10;
            }
            if(arr.length==1) {
                return arr[0];
            }
           for(int i=0;i<arr.length;i++){
         nums[i]=arr[i];
           }
         
        }
        
        return ans;
    }
}