class Solution {
    public boolean sahi(int[] have, int[] need) {
        for (int i = 0; i < 256; i++) {
            if (have[i] < need[i]) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int[] need = new int[256];
        int[] have = new int[256];

        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }

        int low = 0;
        int start = 0;                
        int res = Integer.MAX_VALUE;  

        for (int high = 0; high < s.length(); high++) {
            have[s.charAt(high)]++;

            
            while (sahi(have, need)) {
                int len = high - low + 1;

                if (len < res) {
                    res = len;
                    start = low;
                }

                have[s.charAt(low)]--;
                low++;
            }
        }

        if (res == Integer.MAX_VALUE) return "";  
        return s.substring(start, start + res);   
    }
}
