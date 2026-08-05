class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int low=0;
        int i=0;
        int ans=0;
        while(i<s.length()){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>1){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                low++;
            }

            ans=Math.max(ans,i-low+1);
            i++;
        }
        return ans;
    }
}