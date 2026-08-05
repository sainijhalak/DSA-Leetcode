class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length-1;
        Stack<Integer> s=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=n;i>=0;i--){
          while(!s.isEmpty() && s.peek()<=nums2[i]){
            s.pop();
          }
          if(s.isEmpty()){
            map.put(nums2[i],-1);
            s.push(nums2[i]);
          }
          else if(s.peek()>nums2[i]){
            map.put(nums2[i],s.peek());
            s.push(nums2[i]);
          }
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}