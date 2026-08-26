class Solution {
       static void word(String s,int start,List<String> w,List<String> list,int n,List<String> ans){
        if(start>n) return;
        if(start==n){
            String a="";
            for(int i=0;i< list.size();i++){
                if(i==list.size()-1) a=a+list.get(i);
                else
                  a=a+list.get(i)+" ";
            }
            ans.add(a);
            return;
        }
        for(int i=start;i<s.length();i++){
            if(w.contains(s.substring(start,i+1))){
                list.add(s.substring(start,i+1));
                word(s,i+1,w,list,n,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> list=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        word(s,0,wordDict,list,s.length(),ans);
        return ans;
    }
}