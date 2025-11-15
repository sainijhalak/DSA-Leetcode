class Solution {
    public int totalFruit(int[] fruits) {
    
        Map <Integer,Integer> map= new HashMap<>();
        int low=0;
        int n=fruits.length;
        int res=0;
        
        for(int high=0;high<n;high++){
            int s=fruits[high];
map.put(s,map.getOrDefault(s,0)+1);
while(map.size()>2){
    int l=fruits[low];
map.put(l,map.get(l)-1);
if(map.get(l)==0){
    map.remove(l);
}
low++;

}


    res=Math.max(res,high-low+1);

        }
        return res;
    }
}