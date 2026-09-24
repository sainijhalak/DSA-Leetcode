class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans=0l;
        int h=0;
        int l=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        Map<Integer,Integer> map=new HashMap<>();
        while(h<nums.length){
             map.put(nums[h],map.getOrDefault(nums[h],0)+1);
            while(map.getOrDefault(max,0)==k){
            ans+=nums.length-h;
             map.put(nums[l],map.get(nums[l])-1);
             l++;
             }
             h++;
        }
        return ans;
    }
}