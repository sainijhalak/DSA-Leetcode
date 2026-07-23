class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] p=new int[n];
        int[] s=new int[n];
        int i=0;
        int j=nums.length-1;
        int mp=1;
        int ms=1;
        while(i<n && j>=0){
            p[i]=mp;
            mp=mp*nums[i];
            s[j]=ms;
            ms=ms*nums[j];
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            nums[k]=p[k]*s[k];
        }
        return nums;
    }
}