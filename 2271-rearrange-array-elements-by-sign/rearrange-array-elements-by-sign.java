class Solution {
    public int[] rearrangeArray(int[] nums) {
        List <Integer> l1=new ArrayList<>();
        List <Integer> l2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
if(nums[i]>=0){
    l1.add(nums[i]);
}
else{
    l2.add(nums[i]);
}
        }
        int n=nums.length;
        int i=0;
        int list1=0;
        int list2=0;
        while(n>0){
nums[i]=l1.get(list1);
i++;
nums[i]=l2.get(list2);
list1++;
list2++;
n=n-2;
i++;
        }
        return nums;
    }
}