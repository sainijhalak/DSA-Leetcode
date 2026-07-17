class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list =new ArrayList<>();
        int freq=1;
        int n=nums[0];
        list.add(n);
        int i=1;
        while(i<nums.length){
                if(nums[i]==n && freq<k){
                    freq++;
                    list.add(nums[i]);
                    i++;
                }
                else if(nums[i]==n && freq==k){
                    i++;
                }
                else{
                    freq=1;
                    n=nums[i];
                    list.add(nums[i]);
                    i++;
                }
        }
        int[]arr=new int[list.size()];
        for(int ki=0;ki<list.size();ki++){
      arr[ki]=list.get(ki);
        }
        return arr;
    }
}