class Solution {
    public int maxFrequencyElements(int[] nums) {
        int [] freq=new int[101];
        int f=1; 
         int n=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            
          freq[nums[i]]++;
            }
        
       
        for(int p=0;p<freq.length;p++){
max=Math.max(max,freq[p]);
        }
       
        for(int i=0;i<freq.length;i++){
if(freq[i]==max){
n= n+freq[i];
}
        }
        return n;
    }
}