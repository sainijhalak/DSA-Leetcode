class Solution {
    void findplus( Stack<Integer> s){
        int a=s.peek();
        s.pop();
        int b=s.peek();
        s.pop();
        int c=b+a;
        s.push(c);
    }
     void findmul( Stack<Integer> s){
        int a=s.peek();
        s.pop();
        int b=s.peek();
        s.pop();
        int c=b*a;
        s.push(c);
    }
     void findminus( Stack<Integer> s){
        int a=s.peek();
        s.pop();
        int b=s.peek();
        s.pop();
        int c=b-a;
        s.push(c);
    }
     void finddiv( Stack<Integer> s){
        int a=s.peek();
        s.pop();
        int b=s.peek();
        s.pop();
        int c=b/a;
        s.push(c);
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
              if(tokens[i].equals("+")){
                findplus(s);
              }
              else if(tokens[i].equals("*")){
                findmul(s);
              }
               else if(tokens[i].equals("-")){
                findminus(s);
              }
               else if(tokens[i].equals("/")){
                finddiv(s);
              }
              else{
                s.push(Integer.valueOf(tokens[i]));
              }
        }
     return s.peek();
    }
}