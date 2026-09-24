class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=0;
        int n1=0;
        int l=0;
        int h=0;
        while(h<nums.length){
            map.put(nums[h],map.getOrDefault(nums[h],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.getOrDefault(nums[l],0)==0) map.remove(nums[l]);
                l++;
            }
            n+=h-l+1;
            h++;
        }
        l=0;
        h=0;
            Map<Integer,Integer> map1=new HashMap<>();
        while(h<nums.length){
            map1.put(nums[h],map1.getOrDefault(nums[h],0)+1);
            while(map1.size()>(k-1)){
                map1.put(nums[l],map1.get(nums[l])-1);
                if(map1.getOrDefault(nums[l],0)==0) map1.remove(nums[l]);
                l++;
            }
            n1+=h-l+1;
            h++;
        }
        return n-n1;
    }
}