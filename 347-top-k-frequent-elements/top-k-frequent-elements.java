class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    Map<Integer,List<Integer>> m=new HashMap<>();
    TreeSet<Integer> set = new TreeSet<>();
    for(int x: map.keySet()){
      set.add(map.get(x));
      if(!m.containsKey(map.get(x))) {
        m.put(map.get(x),new ArrayList<>());
      }
      m.get(map.get(x)).add(x);
    }
    List<Integer> l=new ArrayList<>();
    for (int num : set.descendingSet()) {
      for(int i=0;i<m.get(num).size();i++){
        l.add(m.get(num).get(i));
        k--;
        if(k==0) break;
      }
      if(k==0) break;
}
     int[]ans=new int[l.size()];
for(int i=0;i<ans.length;i++){
    ans[i]=l.get(i);
    }
    return ans;
    }
}