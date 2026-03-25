class Solution {
    static String reverse(String c){
        int i=0;
        int j=c.length()-1;
        StringBuilder sb=new StringBuilder(c);
        while(i<j){
         char temp=sb.charAt(i);
         sb.setCharAt(i,sb.charAt(j));
         sb.setCharAt(j,temp);
         i++;
         j--;
        }
        return sb.toString();
    }
    public String reverseWords(String s) {
        String []arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i]=reverse(arr[i]);
        }
        String ans="";
          for(int i=0;i<arr.length-1;i++){
            ans=ans+arr[i]+" ";
        }
       ans=ans+arr[arr.length-1];
       return ans;
    }
}