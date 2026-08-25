class Solution {
    void Permute(int[]nums,int s,List<List<Integer>> list){
        if(s>=nums.length) return;
        if(s==nums.length-1){
            List<Integer> l=new ArrayList<>();
            for(int k=0;k<nums.length;k++){
                l.add(nums[k]);
            }
            list.add(l);
            return;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=s;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            int temp=nums[s];
            nums[s]=nums[i];
            nums[i]=temp;
            Permute(nums,s+1,list);
            temp=nums[s];
            nums[s]=nums[i];
            nums[i]=temp;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Permute(nums,0,list);
        return list;
    }
}