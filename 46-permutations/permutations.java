class Solution {
    void permutation(int[] nums,int start,List<List<Integer>> list){
        if(start==nums.length-1) {
            List<Integer> ans = Arrays.stream(nums).boxed().toList();
            list.add(ans);
            return;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=start;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            int temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
            permutation(nums,start+1,list);
            temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        permutation(nums,0,list);
        return list;
    }
}