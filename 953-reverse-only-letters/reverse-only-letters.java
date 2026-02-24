class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;

        while(i < j){

            while(i < j && !Character.isLetter(c[i])){
                i++;
            }

            while(i < j && !Character.isLetter(c[j])){
                j--;
            }

            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;

            i++;
            j--;
        }

        return new String(c);
    }
}