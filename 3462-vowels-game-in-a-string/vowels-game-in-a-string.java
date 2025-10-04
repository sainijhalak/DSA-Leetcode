class Solution {
    public boolean doesAliceWin(String s) {
        char[] arr = s.toCharArray();
        for(int j=0;j<arr.length;j++){
            if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u' ){
                return true;
            }
        }
        return false;
    }
}