class Solution {
    public boolean isPalindrome(String s) {
         String r1=s.replaceAll("[^a-zA-Z0-9 ]", "").replaceAll(" ", "");
String r=r1.toLowerCase();
char [] arr=r.toCharArray();
int start=0;
int e=arr.length-1;
while(start<e){
    if(arr[start] !=arr[e]){
        return false;
    }
    else{
        start++;
        e--;
    }
}
return true;

    }
}