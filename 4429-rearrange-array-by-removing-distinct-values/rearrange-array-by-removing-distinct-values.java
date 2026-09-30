class Solution {
    public int[] rearrangeArray(int[] nums) {
   List<Integer> list = new ArrayList<>();
    for (int num : nums) list.add(num);
    Collections.sort(list);
    int []ans=new int[nums.length];
    int j=0;
    while(list.size()!=0){
        List<Integer> s=new ArrayList<>();
        for(int i=0;i<list.size();i++){
         if(!s.contains(list.get(i))){
            s.add(list.get(i));
            ans[j]=list.get(i);
            list.remove(list.get(i));
            i--;
            j++;
         }
        }
    }
    return ans;
    }
}