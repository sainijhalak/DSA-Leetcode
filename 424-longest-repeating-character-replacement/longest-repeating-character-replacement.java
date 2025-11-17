class Solution {

    public static int freqs(int []freq){
        int max = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > max){
                max = freq[i];
            }
        }
        return max;
    }

    public int characterReplacement(String s, int k) {
        int low = 0;
        int res = Integer.MIN_VALUE;
        int[] freq = new int[256];

        for(int high = 0; high < s.length(); high++){

            freq[s.charAt(high)]++;

            int len = high - low + 1;
            int maxfreq = freqs(freq);
            int diff = len - maxfreq;

            while(diff > k){
                freq[s.charAt(low)]--;
                low++;

                len = high - low + 1;
                maxfreq = freqs(freq);
                diff = len - maxfreq;
            }

            len = high - low + 1;
            res = Math.max(res, len);
        }

        return res;
    }
}
