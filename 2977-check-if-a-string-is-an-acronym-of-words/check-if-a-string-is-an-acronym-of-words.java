class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        String rs="";
        for(int i=0;i<words.size();i++){
String res=words.get(i);
rs=rs+res.charAt(0);
}
if(rs.equals(s)){
    return true;
}
     return false;   
    }
}