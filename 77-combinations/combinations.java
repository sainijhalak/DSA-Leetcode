class Solution {
     static void tryy(int n,int k,int start ,List<List<Integer>> list,List<Integer> l){
        if(start>n) return;
        if(k==0){
            List<Integer> m=new ArrayList<>(l);
            list.add(m);
            return;
        }
        for(int i=start+1;i<=n;i++){
            l.add(i);
            tryy(n,k-1,i,list,l);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            l.add(i);
            tryy(n,k-1,i,list,l);
            l.remove(l.size()-1);
        }
        return list;
    }
}