class Solution {
    boolean lessThanOne(int []nums){
        boolean ans=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) ans=false;
        }
        return ans;
    }
    public int firstMissingPositive(int[] nums) {
       if(nums.length==1 && nums[0]<=0) return 1; 
       Set<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
            
        }
    
       if(lessThanOne(nums)) return 1; 
        int n=1;
        int i=0;
       for(int x: set){
        if(x!=n) return n;
        n++;
        i++;
       }
       if(i==set.size()) return n;
    return 0;
    }
}