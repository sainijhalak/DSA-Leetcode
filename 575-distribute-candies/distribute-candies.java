class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        int n=candyType.length/2;
        int m=set.size();
        if(m<n) return m;
        return n;
    }
}