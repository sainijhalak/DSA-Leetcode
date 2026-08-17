class Solution {
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i] - '0';
            int idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                int d = arr[j] - '0';

                if (d >= max) {
                    max = d;
                    idx = j;
                }
            }

            if (max > arr[i] - '0') {
                char temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }

        return Integer.parseInt(new String(arr));
    }
}