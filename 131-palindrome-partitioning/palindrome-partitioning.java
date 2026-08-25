class Solution {
    static boolean check(String m){
        if(m.length()==1) return true;
        int i=0,j=m.length()-1;
        while(i<j){
            if(m.charAt(i)!=m.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    void permute(String s,int start,List<List<String>> list, List<String> l){
    if(start>s.length());
    if(start==s.length()){
        list.add(new ArrayList<>(l));
        return;
    }
    for(int i=start;i<s.length();i++){
        if(!check(s.substring(start,i+1))) continue;
        l.add(""+s.substring(start,i+1));
        permute(s,i+1,list,l);
        l.remove(l.size()-1);
    }
    }
    public List<List<String>> partition(String s) {
         List<List<String>> list=new ArrayList<>();
         List<String> l=new ArrayList<>();
         permute(s,0,list,l);
         return list;
    }
}