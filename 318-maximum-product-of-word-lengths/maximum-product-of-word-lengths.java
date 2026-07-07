class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        for(int i=0;i<words.length;i++){
           Set<Character> set = new HashSet<>();
            for(int k=0;k<words[i].length();k++){
                set.add(words[i].charAt(k));
            }
            for(int j=i+1;j<words.length;j++){
                boolean v=true;
               for(int m=0;m<words[j].length();m++){
                if(set.contains(words[j].charAt(m))){ v=false;
                break;}
                
            }
            if(v){
                int mul=words[i].length()*words[j].length(); 
                max=Math.max(max,mul);
            }
            }
        }
        return max;
    }
}