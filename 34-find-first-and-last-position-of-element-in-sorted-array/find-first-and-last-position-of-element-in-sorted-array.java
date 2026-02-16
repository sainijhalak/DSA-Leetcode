class Solution {
    public int[] searchRange(int[] nums, int target) {
        List <Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
                
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                list.add(i);
                break;
            }
        }
        if(list.size()==0){
           return new int[]{-1, -1};


        }
        int []res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}