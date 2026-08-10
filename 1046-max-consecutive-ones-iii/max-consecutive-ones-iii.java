class Solution {
    public int longestOnes(int[] nums, int k) {
        int c=0;
        int o=0;
        int low=0;
        int high=0;
        int ans=0;
        while(high<nums.length){
        if(nums[high]==0) c++;
        else o++;
        while(c>k){
        if(nums[low]==0) c--;
        else o--;
        if(c<=k){
            ans=Math.max(ans,o+c);
        }
        low++;
     }
     ans=Math.max(ans,o+c);
     high++;
        }
        return ans;
    }
}