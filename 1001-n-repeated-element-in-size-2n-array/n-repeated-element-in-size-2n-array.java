class Solution {
    public int repeatedNTimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            if (list.contains(num)) {   // linear search
                return num;
            }
            list.add(num);
        }
        return -1;
    }
}
