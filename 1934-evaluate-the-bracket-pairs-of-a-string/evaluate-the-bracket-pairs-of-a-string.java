class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){

                if(s.charAt(i)=='('){
                    StringBuilder a=new StringBuilder();
                    while(s.charAt(i)!=')') {
                        i++;
                        if(s.charAt(i)==')') break;
                        a.append(s.charAt(i));
                    }
                    if(map.containsKey(a.toString())){
                     sb.append(map.get(a.toString()));
                    }
                    else sb.append('?');
                }
                else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}