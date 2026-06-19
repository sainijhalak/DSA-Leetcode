class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(indices[i],s.charAt(i));
        }
        List<Integer>list=new ArrayList<>(map.keySet());
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
         for(int i=0;i<list.size();i++){
            sb=sb.append(map.get(list.get(i)));
         }
         return sb.toString();
    }
}