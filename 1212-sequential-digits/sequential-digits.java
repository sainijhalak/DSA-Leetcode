class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int lenL=0;
        int lenH=0;
        int l=low;
        int h=high;
        while(l>0){
            lenL++;
            l=l/10;
        }
         while(h>0){
            lenH++;
            h=h/10;
        }
        List<Integer> list=new ArrayList<>();
        while(lenL<=lenH){
       for(int i=0;i<arr.length-lenL+1;i++){
        int n=0;
        for(int j=i;j<i+lenL;j++){
        n=n*10+arr[j];
        }
      if(n>=low && n<=high){
        list.add(n);
      }  
       }
       lenL++;
        }
        return list;
    }
}