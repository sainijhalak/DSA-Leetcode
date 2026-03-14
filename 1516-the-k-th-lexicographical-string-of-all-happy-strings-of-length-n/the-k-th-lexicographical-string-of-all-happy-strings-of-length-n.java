class Solution {
    static Boolean check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
     static void happy(int n,List<String> list,String s){
        if(n==0){
            if(check(s)){
                list.add(s);
            }
            
            return;
        }
 happy(n-1,list,s+"a");
  happy(n-1,list,s+"b");
   happy(n-1,list,s+"c");
     }
    public String getHappyString(int n, int k) {
        List<String> list=new ArrayList<>();
        happy(n,list,"");
        Collections.sort(list);
        if(list.size() < k) return "";

        String ans=list.get(k-1);
        return ans;
    }
}