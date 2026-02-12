class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0;
        int sum2=0;
        int n1=nums1.length;
        int n2=nums2.length;
        for(int i=0;i<nums1.length;i++){
sum1=sum1+nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
sum2=sum2+nums2[i];
        }
        int ans=sum2-sum1;
        int res=ans/n1;
        return res;
    }
}