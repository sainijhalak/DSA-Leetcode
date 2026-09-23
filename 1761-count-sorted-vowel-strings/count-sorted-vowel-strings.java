class Solution {
     static int c;
    static void count(char []arr,int start,String s,int n){
        if(n==0){
            c++;
            return;
        }
        if(start==arr.length) return;
        for(int i=start;i<arr.length;i++){
            if(s.length()>1 && arr[i]<s.charAt(s.length()-1)) continue;
            count(arr,i,s+arr[i],n-1);
        }
    }
    public int countVowelStrings(int n) {
        c=0;
        char[] arr={'a','e','i','o','u'};
        count(arr,0,"",n);
        return c;
    }
}