class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        List<Integer> list=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
               list.add(nums1[i]);
               i++;
            }
            else{
                list.add(nums2[j]);
               j++;
            }
        }
        if(i>=nums1.length){
            while(j<nums2.length){
                list.add(nums2[j]);
                j++;
            }
        }
        if(j>=nums2.length){
            while(i<nums1.length){
                list.add(nums1[i]);
                i++;
            }
        }
        double median=0.0;
        int n=list.size();
        if(list.size()%2==0){
            median=(list.get(n/2- 1) + list.get(n/2)) / 2.0;
        }
        else{
            median=list.get(n/2);
        }
        return median;
    }
}