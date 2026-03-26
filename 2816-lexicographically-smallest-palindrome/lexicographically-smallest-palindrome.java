class Solution {
    public String makeSmallestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        char[]arr=s.toCharArray();
        
        while(i<j){
if(arr[i]!=arr[j]){
    int n1=arr[i]-'a';
    int n2=arr[j]-'a';
    if(n1<n2){
        arr[j]=arr[i];
    }
    else{
        arr[i]=arr[j];
    }
}
i++;
j--;
        }
        String ans="";
        for(int k=0;k<arr.length;k++){
            ans=ans+arr[k];
        }
        return ans;
    }
}