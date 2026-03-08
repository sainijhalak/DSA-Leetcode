class Solution {
    static String revS(String a){
        char[] arr = a.toCharArray();
int i = 0;
int j = arr.length - 1;

while(i < j){
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
}

String ans = new String(arr);
return ans;
    }
    public String finalString(String s) {
        String a="";
        for(int i=0;i<s.length();i++){
if(s.charAt(i)=='i'){
    a=revS(a);
}
else{
    a=a+s.charAt(i);
}
        }
        return a;
    }
}