class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;

       
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                found = true;
                break;
            }
        }
        if (!found) return -1;

        int right = 0;
        int i = startIndex;

      
        while (true) {
            if (words[i].equals(target)) break;
            i = (i + 1) % n;
            right++;
        }

        int left = 0;
        i = startIndex;

       
        while (true) {
            if (words[i].equals(target)) break;
            i = (i - 1 + n) % n;
            left++;
        }

        return Math.min(left, right);
    }
}