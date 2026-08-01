class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> map=new HashMap<>();
        String ans="";
           
         for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         }
         for(int i=0;i<order.length();i++){
            char c=order.charAt(i);
            if(map.containsKey(order.charAt(i))){
                int n=map.get(c);
                for(int j=0;j<n;j++){
                    ans=ans+c;
                }
                map.remove(c);
            }
         }
         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
             if(map.containsKey(s.charAt(i))){
                int n=map.get(c);
                for(int j=0;j<n;j++){
                    ans=ans+c;
                }
                map.remove(c);
            }
            }
         return ans;
         }
    }
