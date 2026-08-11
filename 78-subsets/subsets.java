class Solution { 
    static void KyaApkoSubsetDikhreh(int[] nums,int i, List<List<Integer>> list,List<Integer> l){
        if(i==nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
         l.add(nums[i]);
         KyaApkoSubsetDikhreh(nums,i+1,list,l);
         l.remove(l.size()-1);
         KyaApkoSubsetDikhreh(nums,i+1,list,l);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        KyaApkoSubsetDikhreh(nums,0,list,new ArrayList<>());
        return list;
    }
}