class Solution {
    public String removeStars(String s) {
      
        Stack<Character> s1 = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(s.charAt(i));
            }
        }

        String a ="";
      

        while (!s1.isEmpty()) {
           a=s1.pop()+a;
        }

     

        return a;
    
    }
}