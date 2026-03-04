class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int num1=0;
        int num2=0;
        List<Integer>l1=new ArrayList<>();
         List<Integer>l2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            l1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            l2.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
           if(l2.contains(nums1[i])){
            num1++;
           }
        }
        for(int i=0;i<nums2.length;i++){
             if(l1.contains(nums2[i])){
            num2++;
           }
        }
        return new int[]{num1,num2};
    }
}