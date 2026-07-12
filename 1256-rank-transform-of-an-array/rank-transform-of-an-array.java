class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] help=new int[arr.length];
        for(int i =0;i<help.length;i++){
            help[i]=arr[i];
        }
        Arrays.sort(arr);
        Map <Integer,Integer> map=new HashMap<>();
        int m=1;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],m);
                m++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(help[i]);
        }
        return arr;
    }
}