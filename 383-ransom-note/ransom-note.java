class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> r=new HashMap<>();
        HashMap <Character,Integer> m=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            r.put(ransomNote.charAt(i),r.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            m.put(magazine.charAt(i),m.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(char c:r.keySet()){
            if(r.get(c)>m.getOrDefault(c,0)) return false;
        }
        return true;
    }
}