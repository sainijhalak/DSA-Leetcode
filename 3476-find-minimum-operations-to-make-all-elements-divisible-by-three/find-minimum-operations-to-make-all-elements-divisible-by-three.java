class Solution {
    public int minimumOperations(int[] nums) {
       
       int min;
       int res=0;
        for(int i=0;i<nums.length;i++){
             int op1=0;
       int op2=0;
        int n=nums[i];
            while(n%3!=0){
                
                n=n+1;
                op1++;

            }
            int z=nums[i];
            while(z%3!=0){
                z=z-1;
                op2++;

            }
            min=Math.min(op1,op2);
            res=res+min;


        }
        return res;
    }
}