class Solution {
    public boolean digitCount(String num) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<num.length();i++){
              map.put(num.charAt(i),map.getOrDefault(num.charAt(i),0)+1);
        }
        for(int i=0;i<num.length();i++){
            int n=num.charAt(i)-'0';
            char c = (char)(i + '0');
            if(n!=map.getOrDefault(c,0)){
                return false;
            }
        }
        return true;
    }
}