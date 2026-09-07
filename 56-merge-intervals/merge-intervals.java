class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int s1=intervals[0][0];
        int e1=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int s2=intervals[i][0];
            int e2=intervals[i][1];
           if(e1>=s2){
           e1=Math.max(e1,e2);
           continue;
           }
           list.add(Arrays.asList(s1, e1));
           s1=s2;
           e1=e2;
        }
       list.add(Arrays.asList(s1, e1));
       int[][] ans = new int[list.size()][2];

      for(int i = 0; i < list.size(); i++){
    ans[i][0] = list.get(i).get(0);
    ans[i][1] = list.get(i).get(1);
     }

    return ans;
    }
}