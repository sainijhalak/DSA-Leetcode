class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int l=0;
        int h=0;
        int max=0;
        while(h<nums.length){
            map.put(nums[h],map.getOrDefault(nums[h],0)+1);
            while(map.get(nums[h])>k){
                map.put(nums[l],map.get(nums[l])-1);
                l++;
            }
            max=Math.max(max,h-l+1);
            h++;
        }
        return max;
    }
}