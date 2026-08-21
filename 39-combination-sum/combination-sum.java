class Solution {
    void sum(  List<List<Integer>> list,int[]candidates,int s,int t,List<Integer>l,int sum){
       if(sum>t) return;
       if(s>=candidates.length) return;
       if(sum==t){
        list.add(new ArrayList<>(l));
        return;
       }
       for(int i=s;i<candidates.length;i++){
            int n=candidates[i];
            l.add(n);
            sum(list,candidates,i,t,l,sum+n);
            l.remove(l.size()-1);
       }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        sum(list,candidates,0,target,l,0);
        return list;
    }
}