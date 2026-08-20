class Solution {
    public int[] resultArray(int[] nums) {
        if(nums.length<=2) return nums;
        int i=0;
        int j=1;
        List<Integer> l1=new ArrayList<>();
        l1.add(nums[i]);
        List<Integer> l2=new ArrayList<>();
         l2.add(nums[j]);
        for(int k=2;k<nums.length;k++){
            if(nums[i]>nums[j]){
                l1.add(nums[k]);
                i=k;
            }
            else{
                l2.add(nums[k]);
                j=k;
            }
        }
        
        for(int m=0;m<l1.size();m++){
         nums[m]=l1.get(m);
        }
        int o=l1.size();
        for(int m=0;m<l2.size();m++){
            nums[o]=l2.get(m);
            o++;
        }
        return nums;
    }
}