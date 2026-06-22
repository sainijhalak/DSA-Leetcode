class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int c=nums.length/3;
        List<Integer>list=new ArrayList<>();
        for(int a: map.keySet()){
            if(map.get(a)>c) list.add(a);
        }
        return list;
    }
}