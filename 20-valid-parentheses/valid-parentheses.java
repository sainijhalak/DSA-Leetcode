class Solution {
    public boolean isValid(String s) {
        Stack <Character> q=new Stack<>();
        if(s.length()<2) return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                q.push(s.charAt(i));
            }
            else if(!q.isEmpty() && q.peek()=='(' && s.charAt(i)==')'){
                q.pop();
            }
            else if(!q.isEmpty() && q.peek()=='[' && s.charAt(i)==']'){
                q.pop();
            }
            else if(!q.isEmpty() && q.peek()=='{' && s.charAt(i)=='}'){
                q.pop();
            }
            else{
                q.add(s.charAt(i));
            }
        }
        if(q.isEmpty()) return true;
        return false;
    }
}