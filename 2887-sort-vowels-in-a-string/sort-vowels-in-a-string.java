class Solution {
    Boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public String sortVowels(String s) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))) list.add(s.charAt(i));
        }
        Collections.sort(list);
        String ans="";
        int j=0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                ans=ans+list.get(j);
                j++;
            }
            else{
                ans=ans+s.charAt(i);
            }

        }
        return ans;
    }
}