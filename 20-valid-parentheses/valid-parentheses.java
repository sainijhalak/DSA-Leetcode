class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1) return false;
        Stack <Character> n=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!n.isEmpty() && s.charAt(i)==')' && n.peek()=='('){
                n.pop();
            }
            else if(!n.isEmpty() && s.charAt(i)==']' && n.peek()=='['){
                n.pop();
            }
            else if(!n.isEmpty() && s.charAt(i)=='}' && n.peek()=='{'){
                n.pop();
            }
            else{
                n.push(s.charAt(i));
            }
        }
        if(n.isEmpty()) return true;
        return false;
    }
}