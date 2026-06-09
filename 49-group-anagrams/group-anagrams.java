class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String , List<String>> map=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[]arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                List<String>l=new ArrayList<>();
                l.add(strs[i]);
                map.put(key,l);
            }
            else{
                map.get(key).add(strs[i]);
            }
        }
         for(String k: map.keySet()){
            List<String> list=map.get(k);
            ans.add(list);
         }
         return ans;
    }
}