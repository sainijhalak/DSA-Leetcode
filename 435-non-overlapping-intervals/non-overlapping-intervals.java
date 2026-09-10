class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int c=0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int s1=intervals[0][0];
        int e1=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int s2=intervals[i][0];
            int e2=intervals[i][1];
            if(e1>s2){
                c++;
                continue;
            }
            s1=intervals[i][0];
            e1=intervals[i][1];
        }
        return c;
    }
}