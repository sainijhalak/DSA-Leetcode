class Solution {
    public int[] leftRightDifference(int[] nums) {

        
           int []arr1=new int[nums.length];
             int sum2=0;
        for(int i=0;i<nums.length;i++){
          
            arr1[i]=sum2;
            sum2=sum2+nums[i];
            
           
        }
        int []arr2=new int[nums.length];
         int sum1=0;
     for(int j=arr2.length-1;j>=0;j--){
       
       arr2[j]=sum1;
       sum1=sum1+nums[j];


     }
     int [] res=new int[nums.length];
     for(int k=0;k<nums.length;k++){
res[k]=arr2[k]-arr1[k];
if(res[k]<0){
    res[k] = -res[k];
}
     }
     return res;
        
    }
}