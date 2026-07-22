class Solution {
    public String arrangeWords(String text) {
        text=Character.toLowerCase(text.charAt(0))+text.substring(1,text.length());
       Map<Integer,List<String>> map=new HashMap<>();
       String[]arr=text.trim().split(" ");
       for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i].length())){
           map.put(arr[i].length(),new ArrayList<>());
        }
        map.get(arr[i].length()).add(arr[i]);
       }
       List<Integer> list=new ArrayList<>(map.keySet());
       Collections.sort(list);
       String ans="";
       for(int i=0;i<list.size();i++){
              List<String> l=map.get(list.get(i));
              for(int j=0;j<l.size();j++){
                ans=ans+l.get(j)+" ";
              }
       }
       ans=Character.toUpperCase(ans.charAt(0))+ans.substring(1,ans.length());
       return ans.trim();
    }
}