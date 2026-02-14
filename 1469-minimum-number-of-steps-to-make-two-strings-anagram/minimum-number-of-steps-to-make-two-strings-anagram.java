class Solution {
    public int minSteps(String s, String t) {
        int []ss=new int [256];
        int []tt=new int [256];
        
        for(int i=0;i<s.length();i++){
            ss[s.charAt(i)]++;
        }
         for(int i=0;i<t.length();i++){
            tt[t.charAt(i)]++;
        }
        int ans=0;
        for(int i=0;i<ss.length;i++){
if(tt[i]==ss[i]){
    continue;
}
else if(tt[i]>ss[i]){
    int diff=tt[i]-ss[i];
    ans=ans+diff;
}
else {
    if(ss[i]==0 && tt[i]!=0){
        ans=ans+tt[i];
    }
}

        }
        return ans;
    }
}