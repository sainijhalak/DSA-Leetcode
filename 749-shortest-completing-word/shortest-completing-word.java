class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map <Character,Integer> map=new HashMap<>();
        for(int i=0;i<licensePlate.length();i++){
            if(Character.isLetter(licensePlate.charAt(i))){
                char c=Character.toLowerCase(licensePlate.charAt(i));
                map.put(c,map.getOrDefault(c,0)+1);
            }
        
        }
        List<String>list=new ArrayList<>();
        for(int j=0;j<words.length;j++){
             Map <Character,Integer> m=new HashMap<>();
              String s=words[j].toLowerCase();
              int flag=1;
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character keys: map.keySet()){
            if( map.get(keys)>m.getOrDefault(keys,0)) flag=0;
        }
        if(flag==1) list.add (s);

        }
        String ans=list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i).length()<ans.length()) ans=list.get(i);
        }
        return ans;
    }
}