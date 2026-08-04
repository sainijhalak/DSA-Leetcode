
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
       int n= nums.length;
        List<Integer> missing =new ArrayList<>();
        int j=nums[0];
        for(int i=0;i<n;i++){
while(j<nums[i]){
    missing.add(j);
    j++;
}
            j=nums[i]+1;
            
        }
        return missing; 
        
    }
}