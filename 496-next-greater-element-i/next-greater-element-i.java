class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            for(int j=i+1;j<nums2.length;j++){
                         if(nums2[i]<nums2[j]){
                            map.put(nums2[i],nums2[j]);
                            break;
                         }
            }
        }
        for(int m=0;m<nums1.length;m++){
            if(map.containsKey(nums1[m])){
                 int x=map.get(nums1[m]);
            nums1[m]=x;
            }
            else{
                nums1[m]=-1;
            }
           
        }
        return nums1;
    }
}