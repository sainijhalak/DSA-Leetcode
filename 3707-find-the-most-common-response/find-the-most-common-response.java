class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> map=new HashMap<>();
        int max=0;
        TreeSet<String> s=new TreeSet<>();
        for(int i=0;i<responses.size();i++){
            Set<String> set=new HashSet();
            for(int j=0;j<responses.get(i).size();j++){
                if(set.contains(responses.get(i).get(j))) continue;
            map.put(responses.get(i).get(j),map.getOrDefault(responses.get(i).get(j),0)+1);
            set.add(responses.get(i).get(j));
            max=Math.max(max,map.get(responses.get(i).get(j)));
            }
        }
        for(String x: map.keySet()){
            if(map.get(x)==max) s.add(x);
        }
        return s.first();
    }
}