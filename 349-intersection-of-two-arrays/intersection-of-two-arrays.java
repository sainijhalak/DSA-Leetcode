class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
for(int j=0;j<nums2.length;j++){
    if(nums2[j]==nums1[i]){
        set.add(nums2[j]);
    }
}}
int m=0;
int[]ans=new int[set.size()];
for(int i: set){
    ans[m]=i;
    m++;
}
return ans;
        
    }
}