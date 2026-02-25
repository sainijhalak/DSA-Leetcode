class Solution {

    static int countBit(int n){
        int m = 1;
        int c = 0;
        while(n > 0){
            c += (n & m);
            n = n >> 1;
        }
        return c;
    }

    public int[] sortByBits(int[] arr) {

        Arrays.sort(arr);

        int[] num = new int[arr.length];
        int[] res = new int[arr.length];

        int max = 0;

        for(int i = 0; i < arr.length; i++){
            num[i] = countBit(arr[i]);
            max = Math.max(max, num[i]);
        }

        int k = 0;

        for(int i = 0; i <= max; i++){
            for(int j = 0; j < arr.length; j++){
                if(num[j] == i){
                    res[k++] = arr[j];
                }
            }
        }

        return res;
    }
}