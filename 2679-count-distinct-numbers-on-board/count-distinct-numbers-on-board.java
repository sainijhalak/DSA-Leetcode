class Solution {
    public int distinctIntegers(int n) {
        Set<Integer> set=new HashSet<>();
        while(n>0){
              int num=n;
              int i=1;
              while(i<num){
                if(num%i==1) set.add(i);
                i++;
              }
             n--;
        }
        return set.size()+1;
    }
}