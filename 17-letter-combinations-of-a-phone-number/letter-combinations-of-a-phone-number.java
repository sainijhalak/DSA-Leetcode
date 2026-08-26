class Solution {
      static void letterCombination(Map<Character,String>map,String digits,int start,String s,int len,List<String> list){
        if(start>digits.length()) return;
        if(len==0){
            list.add(s);
            return;
        }
       
            String a=map.get(digits.charAt(start));
            for(int j=0;j<a.length();j++){
                letterCombination(map,digits,start+1,s+a.charAt(j),len-1,list);
            }

    }
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
     Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        letterCombination(map,digits,0,"",digits.length(),list);
        return list;
    }
}