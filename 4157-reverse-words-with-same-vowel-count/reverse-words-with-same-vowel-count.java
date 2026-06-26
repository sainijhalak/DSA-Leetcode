class Solution {
    int count(String a){
        int c=0;
        for(int i=0;i<a.length();i++){
           if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' ||
   a.charAt(i) == 'o' || a.charAt(i) == 'u'){
    c++;
   }
        }
        return c;
    }
    String rev(String r){
        StringBuilder sb=new StringBuilder(r);
        int i=0;
        int j=r.length()-1;
        while(i<j){
         char temp=r.charAt(i);
         sb.setCharAt(i,r.charAt(j));
         sb.setCharAt(j,temp);
         i++;
         j--;
        }
        return sb.toString();
    }
    
    public String reverseWords(String s) {
        String ans="";
       String[] arr = s.trim().split("\\s+");
       int t=count(arr[0]);
        ans=ans+" "+arr[0];
        for(int i=1;i<arr.length;i++){
             int c=count(arr[i]);
            if(c!=t){

                ans=ans+" "+arr[i];
            }
            else{
                String m=rev(arr[i]);
                ans=ans+" "+m;
            }
        }
        return ans.trim();
    }
}