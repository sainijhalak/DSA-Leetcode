class Solution {
    void Generating(String s,int o,int c,List<String> list){
        if(o==0 && c==0){
            list.add(s);
            return;
        }
        if(o==c){
             Generating(s+"(",o-1,c,list);
        }
        else if(o==0 && c>0){
             Generating(s+")",o,c-1,list);
        }
        else{
             Generating(s+"(",o-1,c,list);
              Generating(s+")",o,c-1,list);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        Generating("",n,n,list);
        return list;
    }
}