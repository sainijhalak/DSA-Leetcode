class Solution {
    public int removeDuplicates(int[] nums) {
        // if (nums.length == 0) return 0;

        // int i = 0;  

        // for (int j = 1; j < nums.length; j++) {
        //     if (nums[j] != nums[i]) {
        //         i++;
        //         nums[i] = nums[j];  
        //     }
        // }

        // return i + 1;  

        int i=0;
        int j=1;
        int ans=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                j++;
                continue;
            }
            nums[i+1]=nums[j];
            ans++;
            j++;
            i++;
        }
        return ans;


    }
}
