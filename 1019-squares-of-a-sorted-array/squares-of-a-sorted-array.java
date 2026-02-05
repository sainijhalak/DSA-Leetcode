class Solution {
    public int[] sortedSquares(int[] nums) {
        int pos=0;
        int neg=0;
        for(int i=0;i<nums.length;i++){
if(nums[i]>=0){
    pos++;
}
else{
    neg++;
}
        }
        int []posi=new int[pos];
        int []nega=new int[neg];
        int n=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                posi[p]=nums[i]*nums[i];
                p++; }
                else{
                nega[n]=nums[i]*nums[i];
                    n++;
                }
           
        }
        Arrays.sort(nega);
        int res[]=new int[nums.length];
        int i=0;
        int j=0;
        int k=0;
        while(k<posi.length && j<nega.length){
            if(posi[k]<=nega[j]){
                res[i]=posi[k];
                k++;
                i++;
            }
            else{
                res[i]=nega[j];
                j++;
                i++;
            }
        }
        while(j<nega.length){
            if(k>=posi.length){
                res[i]=nega[j];
                j++;
                i++;
            }
        }
         while(k<posi.length){
            if(j>=nega.length){
                res[i]=posi[k];
                k++;
                i++;
            }
        }
        return res;

    }
}