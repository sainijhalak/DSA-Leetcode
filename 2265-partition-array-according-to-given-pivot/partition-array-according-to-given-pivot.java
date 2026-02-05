class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List <Integer> list =new ArrayList<>();
       
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                list.add(nums[i]);
            }
        }
       for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                list.add(nums[i]);
            }
        }

      for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                list.add(nums[i]);
            }
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=list.get(j);
        }
        return nums;
    }
}