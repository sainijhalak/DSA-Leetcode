class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        
        for(int i=0;i<A.length;i++){

         map.put(A[i],map.getOrDefault(A[i],0)+1);
         map.put(B[i],map.getOrDefault(B[i],0)+1);

         if(A[i]==B[i] && map.containsKey(A[i]) &&  map.get(A[i])==2) count++;
         else{
            if(map.containsKey(A[i]) && map.get(A[i])==2) count++;
         if(map.containsKey(B[i]) && map.get(B[i])==2) count++;
         }
         
         B[i]=count;
        }
        return B;
    }
}