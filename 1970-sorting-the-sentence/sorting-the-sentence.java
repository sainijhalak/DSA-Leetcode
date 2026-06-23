class Solution {
    public String sortSentence(String s) {
        String[] ar=s.trim().split(" ");
        String [] arr=new String[ar.length];
        for(int i=0;i<ar.length;i++){
           String a=ar[i];
           int n=(a.charAt(a.length()-1))-'0';
           arr[n-1]=a.substring(0,a.length()-1);
        }
         String ans= String.join(" ", arr);
         return ans;
    }
}