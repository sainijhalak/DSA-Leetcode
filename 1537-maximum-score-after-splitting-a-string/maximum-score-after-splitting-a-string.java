class Solution {
    int left(String l){
        int count=0;
        for(int i=0;i<l.length();i++){
            if(l.charAt(i)=='0') count++;
        }
        return count;
    }
      int right(String r){
        int count=0;
        for(int i=0;i<r.length();i++){
            if(r.charAt(i)=='1') count++;
        }
        return count;
    }
    public int maxScore(String s) {
        int n=s.length();
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            int cl=left(s.substring(0,i));
            int cr=right(s.substring(i,n));
            int ans=cl+cr;
            max=Math.max(ans,max);
        }
        return max;
    }
}