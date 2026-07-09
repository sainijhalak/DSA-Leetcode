class Solution {
    public int minSwapsCouples(int[] row) {
        int n=row.length;
        int m=row.length;
        int i=0;
        int swap=0;
        while(m>0){
            int idx=0;
            int id=0;
            for(int j=0;j<row.length;j++){
                 if(row[j]==i){
                    idx=j;
                    break;
                 }
            }
            for(int j=0;j<row.length;j++){
                 if(row[j]==i+1){
                    id=j;
                    break;
                 }
            }
            if((idx+1<n && row[idx+1]==i+1) ||( idx-1>=0 && row[idx-1]==i+1)){
                 m=m-2;
                  i=i+2;
                continue;
            }
            if(idx%2==0){
                  if(idx+1<n && row[idx+1]!=i+1 ){
             swap++;
             int temp=row[idx+1];
             row[idx+1]=row[id];
             row[id]=temp;
               i = 0;
        m = row.length;
        continue;
        }
            }
          
         else{
           if( idx-1>=0 && row[idx-1]!=i+1){
                swap++;
             int temp=row[idx-1];
             row[idx-1]=row[id];
             row[id]=temp;
               i = 0;
        m = row.length;
        continue;
            } 
         } 
            m=m-2;
            i=i+2;
    }
    return swap;
}
}