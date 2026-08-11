class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int num=n;
        while(num>0){
            int s=num%10;
            map.put(s,map.getOrDefault(s,0)+1);
            num=num/10;
        }
        for(int x: map.keySet()){
              min=Math.min(min,map.get(x));
        }
         for(int x: map.keySet()){
            if(map.get(x)==min) return x;
        }
       return -1;
    }
}