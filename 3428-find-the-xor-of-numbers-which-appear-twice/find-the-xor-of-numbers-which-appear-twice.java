class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int res=0;
        List <Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
res=res^nums[i];
            }
            else{
                 list.add(nums[i]);
            }
           
        }
        return res;

    }
}