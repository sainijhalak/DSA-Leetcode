class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
         int low=0;
         int high=0;
         int c=0;
         String ans="";
         List<String> l=new ArrayList<>();
         while(high<s.length()){
               if(s.charAt(high)=='1') c++;
               while(c>k || s.charAt(low)=='0'){
                if(low==s.length()-1) return ans;
                if(s.charAt(low)=='1'){ 
                c--;
                }
                low++;
               }
               if(c==k){
                String curr=s.substring(low,high+1);
                if(ans.equals("")){
                    ans=curr;
                }
                else if(curr.length()<ans.length()){
                    ans=curr;
                }
                else if(curr.length()==ans.length()){
                 if(curr.compareTo(ans)<0) ans=curr;
                }
                
                }
               high++;
         }
        //  int idx=ans.length()-1;
        //  for(int i=ans.length()-1;i>=0;i--){
        //     if(ans.charAt(i)=='1'){
        //         idx=i;
        //         break;
        //     }
        //  }
        //  String a=ans.substring(0,idx+1);
         return ans;
    }
}