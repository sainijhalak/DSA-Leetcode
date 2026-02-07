class Solution {
    public int countDistinctIntegers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            int n = reverseNum(nums[i]);
            list.add(n);
        }

        Set<Integer> ll = new HashSet<>();   

        int nn = list.size();
        for (int i = 0; i < nn; i++) {
            ll.add(list.get(i));          
        }

        return ll.size();                   
    }

    public int reverseNum(int x) {
        int num = x;
        int rev = 0;
        while (num > 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        return rev;
    }
}
