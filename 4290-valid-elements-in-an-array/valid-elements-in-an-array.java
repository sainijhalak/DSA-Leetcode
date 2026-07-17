class Solution {
    public List<Integer> findValidElements(int[] nums) {
        boolean [] check=new boolean[nums.length];
        List<Integer> list =new ArrayList<>();
        check[0]=true;
        check[nums.length-1]=true;
        int m1=nums[0];
        int m2=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>m1){
                m1=nums[i];
                check[i]=true;
            }
        }
         for(int i=nums.length-2;i>=1;i--){
            if(nums[i]>m2){
                m2=nums[i];
                check[i]=true;
            }
        }
        for(int i=0;i<check.length;i++){
            if(check[i]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}