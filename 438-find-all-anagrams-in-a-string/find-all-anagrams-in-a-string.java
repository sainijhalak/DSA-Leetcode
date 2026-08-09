class Solution {
    boolean check(String p, Map<Character,Integer> map1,Map<Character,Integer> map2){
        for(int i=0;i<p.length();i++){
            if(!Objects.equals(map2.get(p.charAt(i)), map1.get(p.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(s.length()< p.length()) return list;
        int low=0;
        int high=p.length();
        Map<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<p.length();i++){
            map1.put(p.charAt(i),map1.getOrDefault(p.charAt(i),0)+1);
        }
         Map<Character,Integer> map2=new HashMap<>();
         for(int i=0;i<p.length();i++){
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
         }
         if(check(p,map1,map2)){
            list.add(low);
         }
         while(high<s.length()){
            map2.put(s.charAt(low),map2.getOrDefault(s.charAt(low),0)-1);
            if(map2.get(s.charAt(low))==0) map2.remove(s.charAt(low));
            low++;
            map2.put(s.charAt(high),map2.getOrDefault(s.charAt(high),0)+1);
           
             if(check(p,map1,map2)){
                list.add(low);
             }
              high++;
         }
         return list;
    }
}