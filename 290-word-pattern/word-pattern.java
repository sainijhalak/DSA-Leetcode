class Solution {
    public boolean wordPattern(String pattern, String s) {
        Set<String> set=new HashSet<>();
        String [] arr=s.trim().split(" ");
         if(pattern.length()!=arr.length) return false;
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(set.contains(arr[i])) return false;
                map.put(pattern.charAt(i),arr[i]);
                set.add(arr[i]);
            }
            else{
                if(arr[i].equals(map.get(pattern.charAt(i)))) continue;
                else return false;
            }
        }
        return true;
    }
}