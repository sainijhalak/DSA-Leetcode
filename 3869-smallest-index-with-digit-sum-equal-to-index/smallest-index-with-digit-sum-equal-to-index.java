class Solution {
    int sum(int n){
        int ans=0;
        while(n>0){
        int r=n%10;
        ans=ans+r;
        n=n/10;
        }
        return ans;
    }
    public int smallestIndex(int[] nums) {
        int ans=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<10){
            if(nums[i]==i) return i;
        }
        else{
            int n=sum(nums[i]);
            if(n==i) return i;
        }
       } 
       return -1;
    }
}