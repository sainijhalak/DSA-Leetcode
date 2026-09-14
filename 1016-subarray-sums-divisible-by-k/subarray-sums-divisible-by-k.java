class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int p=0;
        int c=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            p=p+nums[i];
            int need = ((p % k) + k) % k;
            if(map.containsKey(need)) c=c+map.get(need);
            map.put(need,map.getOrDefault(need,0)+1);
        }
        return c;
    }
}