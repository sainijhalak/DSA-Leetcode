class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        if(nums.length<=k) return nums.length;
        if(k==0) return 0;
        Map<Integer,Integer> map=new HashMap<>();
        int low=0;
        int high=0;
        int max=0;
        while(high<nums.length){
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
              while(map.get(nums[high])>k){
                map.put(nums[low],map.get(nums[low])-1);
                 low++;
                max=Math.max(max,high-low+1);
                if(map.get(nums[low])==0){
                    map.remove(nums[low]);
                }
              }
              max=Math.max(max,high-low+1);
              high++;
        }
        return max;
    }
}