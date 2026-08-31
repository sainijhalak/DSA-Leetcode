class Solution {
    public int countSpecialIntegers(int[] nums) {
        if(nums.length==1) return 1;
        Map <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int l=0;
        int r=0;
        int count=0;
        
         while(l<nums.length && r<nums.length){
               while(l<nums.length && nums[l]==nums[r]) l++;
               if(map.get(nums[r])==l-r) count++;
               r=l;
               l=r;
         }
        
         return count;
    }
}