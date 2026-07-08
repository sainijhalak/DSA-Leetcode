class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0 && map.containsKey(arr[i]/2)){
                if(i!=map.get(arr[i]/2)) return true;
            }
            else if(map.containsKey(arr[i]*2) && i!=map.get(arr[i]*2)){
                return true;
            }
            else{
                map.put(arr[i],i);
            }
        }
        return false;
    }
}