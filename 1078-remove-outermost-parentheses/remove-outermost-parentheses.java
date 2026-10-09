class Solution {
    public String removeOuterParentheses(String s) {
    int prev=0;
    int o=0;
    int c=0;
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='(') o++;
       else c++;
       if(o==c ){
        int curr=i;
        sb.append(s.substring(prev+1,curr));
        prev=i+1;
       }
    }   
    return sb.toString();
    }
}