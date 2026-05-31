class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        while(n>0){
            int r=n%10;
            map.put(r,map.getOrDefault(r,0)+1);
            n=n/10;
        }
        int sum=0;
        for(int m: map.keySet()){
            int a =m*map.get(m);
            sum=sum+a;
        }
        return sum;
    }
}