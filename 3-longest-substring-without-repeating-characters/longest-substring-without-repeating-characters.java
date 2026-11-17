class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int low=0;
        int high=0;
        int ans=0;
        while(high<s.length()){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            while(map.get(s.charAt(high))>1){
                char c=s.charAt(low);
                map.put(c,map.get(c)-1);
             low++;
            }
             ans=Math.max(high-low+1,ans);
             high++;
        }
        return ans;
    }
}