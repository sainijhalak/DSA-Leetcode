class Solution {
    public int maxProduct(int n) {
       
        char[] digits = String.valueOf(n).toCharArray();
      
        Arrays.sort(digits);
        int len = digits.length;
       
        int d1 = digits[len - 1] - '0';
        int d2 = digits[len - 2] - '0';
        return d1 * d2;
    }
}
