class Solution {
    public boolean areOccurrencesEqual(String s) {
        int []arr=new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;

        }
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
m=arr[i];
break;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[i]!=m ){
                return false;
            }
        }
        return true;
    }
}