class Solution {
    public int missingMultiple(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0) {
                 set.add(nums[i]);
                 }
        }
        int j=k;
        int m=1;
        for(int i :set){
            if(j!=i) return j;
            m++;
            j=k*m;
        }
        return k*m;
    }
}