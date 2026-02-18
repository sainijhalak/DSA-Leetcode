class Solution {
    public boolean hasAlternatingBits(int n) {
        int mask=1;
        List <Integer> list =new ArrayList<>();
        while(n!=0){
            int bit=n&1;

list.add(bit);
n=n>>1;
        }
       for(int i=1;i<list.size();i++){
        if(list.get(i-1)==list.get(i)){
            return false;
        }
       }
       return true;
    }
}