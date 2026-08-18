class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k<=0 || k>nums.length) return -1;
         Map<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          }
          int ans=-1;

        if(k==1){
          for(int i:map.keySet()){
             if(map.get(i)==1 && i>ans){
                ans=i;
             }
          }
          return ans;
        }
        if(k==nums.length){
            int max=0;
            for(int i=0;i<nums.length;i++){
                max=Math.max(max,nums[i]);
            }
            return max;
        }
        int m=map.get(nums[0]);
        int n=map.get(nums[nums.length-1]);
        if(m==1 && n==1)
        return Math.max(nums[0],nums[nums.length-1]);
        else if(m>1 && n>1) return -1;
        else if(m>1 && n==1) return nums[nums.length-1];
        return nums[0]; 
    }
}