class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!s2.isEmpty()) {
                    s2.pop();
                }
            } else {
                s2.push(t.charAt(i));
            }
        }

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        while (!s1.isEmpty()) {
            a.append(s1.pop());
        }

        while (!s2.isEmpty()) {
            b.append(s2.pop());
        }

        return a.toString().equals(b.toString());
    }
}