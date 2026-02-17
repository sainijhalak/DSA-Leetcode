class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Map <Integer,Integer> map =new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
        for(int i=0;i<nums.length;i++){
            int n1=nums[i]+1;
             int n2=nums[i]-1;
             int n3=map.get(nums[i]);
            if(map.containsKey(n1)==false && map.containsKey(n2)==false && n3==1){
                res.add(nums[i]);
            }
        }
return res;
    }
}