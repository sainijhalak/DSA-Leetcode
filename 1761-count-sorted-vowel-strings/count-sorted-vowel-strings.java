class Solution {
  static Integer[][]dp;

    static int count(char []arr,int start,String s,int n){
        if(n==0){
            return dp[n][start]=1;
        }
        if(start==arr.length) return dp[n][start]=0;
        if(dp[n][start]!=null) return dp[n][start];
        int ans=0;
        for(int i=start;i<arr.length;i++){
            if(s.length()>1 && arr[i]<s.charAt(s.length()-1)) continue;
            ans=ans+count(arr,i,s+arr[i],n-1);
        }
        return dp[n][start]=ans;
    }
    public int countVowelStrings(int n) {
        dp=new Integer[n+1][6];
        char[] arr={'a','e','i','o','u'};
        int c=count(arr,0,"",n);
        return c;
    }
}