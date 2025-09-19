class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        
        int t;
        for(int i=0;i<n;i++){
            int count=0;
            t=nums[i];
            for(int j=0;j<n;j++){

if(t==nums[j]){
    count++;

}
}
if(count==1){
    return nums[i];
}}
return 0;

    }
}