class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<=3){
            return false;
        }
        int c1=0;
        int c2=0;
        int c3=0;
        int i=1;
         while(i<nums.length){
            if(nums[i]>nums[i-1]){
                c1++;
                i++;
                continue;
            }
            else{
                break;
            }
         }
         if(c1==0){
            return false;
         }
       while(i<nums.length){
        if(nums[i]<nums[i-1]){
            c2++;
            i++;
            continue;
        }
        else{
            break;
        }
       }
       if(c2==0){
        return false;
       }
       while(i<nums.length){
        if(nums[i]>nums[i-1]){
            c3++;
            i++;
            continue;
        }
        else{
            return false;
        }
       }
       if(c3==0){
        return false;
       }
       return true;
    }
}