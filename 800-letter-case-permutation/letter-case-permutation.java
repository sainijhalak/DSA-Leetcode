class Solution {
    void letter(String s, String b,int i,List<String> list){
        if(i==s.length()){
            list.add(b);
            return;
        }
        if(Character.isDigit(s.charAt(i))){
            letter(s,b+s.charAt(i),i+1,list);
        }
        else{
             char c=s.charAt(i);
             char d;
             if(Character.isUpperCase(c)){
                d=Character.toLowerCase(s.charAt(i));
             }
             else{
                 d=Character.toUpperCase(s.charAt(i));
             }
        
        letter(s,b+c,i+1,list);
        letter(s,b+d,i+1,list);
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> list=new ArrayList<>();
        letter(s,"",0,list);
        return list;
    }
}