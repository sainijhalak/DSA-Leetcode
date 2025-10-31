class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] arr=new int[nums.length];
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums.length)
            {
                arr[nums[i]]++;
            }
            
            
        }
        int s=0;
        for(int j=0;j<arr.length;j++){
            
            if(arr[j]>=2){
              
               s++;
            }}
        int [] ans=new int[s];
        int i=0;
        for(int j=0;j<arr.length;j++){
            
            if(arr[j]>=2){
               ans[i]=j;
               i++;
            }
            else{
                continue;
            }
           
        }
        
         
        return ans;

    }
}