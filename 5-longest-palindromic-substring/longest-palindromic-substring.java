class Solution {

    boolean check(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public String longestPalindrome(String s) {

        int max = 0;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                String temp = s.substring(i, j + 1);

                if (check(temp) && temp.length() > max) {
                    max = temp.length();
                    ans = temp;
                }
            }
        }

        return ans;
    }
}