class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] shuffle =new int[nums.length];
        int k=0;
        int [] arr1= new int[n];
         int [] arr2= new int[nums.length-n];
         for(int i=0;i<n;i++){
            arr1[i]=nums[i];
         }
         int j=0;
          for(int i=n;i<nums.length;i++){
            arr2[j]=nums[i];
            j++;
         }
          for (int i = 0; i < n; i++) {
            shuffle[k++] = arr1[i];
            shuffle[k++] = arr2[i];
        }
       return shuffle;
    }
}