class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
         String r = s.trim();
        int i=r.length()-1;
while( i>=0 && r.charAt(i)!=' ' ){
count++;
i--;
}
return count;
    }
}