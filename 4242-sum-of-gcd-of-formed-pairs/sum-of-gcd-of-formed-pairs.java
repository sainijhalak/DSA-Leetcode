class Solution {
  int pg(int n, int m) {
    if (m == 0)
        return n;

    return pg(m, n % m);
}
    public long gcdSum(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            int n=Math.max(max,nums[i]);
            int m=Math.min(max,nums[i]);
            nums[i]=pg(n,m);
        }
        Arrays.sort(nums);
        long ans=0;
        int p=0;
        int q=nums.length-1;
        while(p<q){
         ans=ans+pg(nums[p],nums[q]);
         p++;
         q--;
        }
        return ans;
    }
}