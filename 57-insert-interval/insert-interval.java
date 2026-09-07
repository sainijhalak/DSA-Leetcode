class Solution { 
    public int[][] insert(int[][] intervals, int[] newInterval) { 
        if(intervals.length == 0) 
            return new int[][]{{newInterval[0],newInterval[1]}}; 
        
        int[][]n=new int[intervals.length+1][2]; 
        boolean flag=false; 
        int j=0; 
        
        for(int i=0;i<intervals.length;i++){ 
            if(newInterval[0]<=intervals[i][0] && !flag){ 
                n[j][0]=newInterval[0]; 
                n[j][1]=newInterval[1]; 
                flag=true; 
                j++; 
            } 
            
            n[j][0]=intervals[i][0]; 
            n[j][1]=intervals[i][1]; 
            j++; 
        } 
        
        if(!flag){
            n[j][0]=newInterval[0];
            n[j][1]=newInterval[1];
            j++;
        }
        
        List<List<Integer>> list=new ArrayList<>(); 
        int s1=n[0][0]; 
        int e1=n[0][1]; 
        
        for(int i=1;i<n.length;i++){ 
            int s2=n[i][0]; 
            int e2=n[i][1]; 
            
            if(e1>=s2){ 
                e1=Math.max(e1,e2); 
            }
            else{
                list.add(Arrays.asList(s1,e1)); 
                s1=s2; 
                e1=e2; 
            }
        } 
        
        list.add(Arrays.asList(s1,e1)); 
        
        int[][] ans=new int[list.size()][2]; 
 
        for(int i=0;i<list.size();i++){ 
            ans[i][0]=list.get(i).get(0); 
            ans[i][1]=list.get(i).get(1); 
        } 
 
        return ans; 
    } 
}