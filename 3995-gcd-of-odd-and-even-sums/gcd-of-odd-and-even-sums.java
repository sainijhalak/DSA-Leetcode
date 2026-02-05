class Solution {
    public int gcdOfOddEvenSums(int n) {
        int os=0;
        int es=0;
        int i=2;
      while(n>0){
os=os+i-1;
es=es+i;
i=i+2;
n--;
      }
      int min=Math.min(os,es);
      for(int j=min;j>0;j--){
        if(es%j==0 && os%j==0){
            return j;
        }
      }
      return 0;
    }
}