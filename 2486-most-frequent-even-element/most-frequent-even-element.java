class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                 map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
           
        }
        int max=0;
        int ans=-1;
        for(int n: map.keySet()){
            if(map.get(n)>max){
                ans=n;
                max=map.get(n);
            }
            else if(map.get(n)==max){
                ans=Math.min(ans,n);
            }
        }
        return ans;
    }
}