
        class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
           int value=Math.abs(nums[i]);
           int idx=value-1;
           if(nums[idx]>0){
            nums[idx]=-1*nums[idx];
           }
           else{
            list.add(Math.abs(nums[i]));
           }
        }
        return list;
    }
}
    
