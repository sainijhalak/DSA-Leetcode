class Solution {
    public boolean isHappy(int n) {
        int num = n;

        while (num != 1 && num != 4) { 
            int s = 0;
            
            
            while (num > 0) {
                int r = num % 10;
                s = s + r * r;
                num = num / 10;
            }

            num = s; 
        }

        return num == 1;
    }
}
