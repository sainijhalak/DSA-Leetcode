class Solution {
    public String arrangeWords(String text) {
        text=Character.toLowerCase(text.charAt(0))+text.substring(1,text.length());
     TreeMap<Integer, List<String>> map = new TreeMap<>();
       String[]arr=text.trim().split(" ");
       for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i].length())){
           map.put(arr[i].length(),new ArrayList<>());
        }
        map.get(arr[i].length()).add(arr[i]);
       }
       String ans="";
       for(int x: map.keySet()){
              List<String> l=map.get(x);
              for(int j=0;j<l.size();j++){
                ans=ans+l.get(j)+" ";
              }
       }
       ans=Character.toUpperCase(ans.charAt(0))+ans.substring(1,ans.length());
       return ans.trim();
    }
}