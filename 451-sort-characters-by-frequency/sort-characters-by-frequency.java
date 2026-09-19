class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        Map<Integer,List<Character>> newMap=new HashMap<>();
        for(char x: map.keySet()){
         if(!newMap.containsKey(map.get(x))){
            newMap.put(map.get(x),new ArrayList<>());
         }
         newMap.get(map.get(x)).add(x);
        }

        StringBuilder sb=new StringBuilder();
        List<Integer>list=new ArrayList<>(newMap.keySet());
        Collections.sort(list,Collections.reverseOrder());

        for(int i=0;i<list.size();i++){
            for(char x:newMap.get(list.get(i))){
                for(int j=0;j<list.get(i);j++){
                    sb.append(x);
                }
            }
        }

        return sb.toString();
    }
}