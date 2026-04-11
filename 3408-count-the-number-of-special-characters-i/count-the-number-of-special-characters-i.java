class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character,Integer>map=new HashMap<>();
        int count=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                set.add(word.charAt(i));
            }
            
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
          for(char c:set){
            char t=Character.toUpperCase(c);
           int k= map.getOrDefault(t,0);
           if(k>=1) count++;
          }
          return count;
    }
}