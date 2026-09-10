class Solution {
    public int compress(char[] chars) {
        if(chars.length==1) return 1;
        int i=1;
        StringBuilder sb=new StringBuilder();
        sb.append(chars[0]);
        int c=1;
        while(i<chars.length){
            while(i<chars.length && chars[i]==chars[i-1]){
                c++;
                i++;
            }
            if(c>1) sb.append(String.valueOf(c));
            if(i<chars.length){
                 sb.append(chars[i]);
            c=1;
            i++;
            }
           
        }
        for(int j=0;j<sb.length();j++){
            
            chars[j]=sb.charAt(j);
        }
        return sb.toString().length();
    }
}