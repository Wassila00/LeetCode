class Solution {
    public boolean isValid(String s) {
        Stack<Character> pile = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);

            if (p == '(' || p == '{' || p == '[') {
                pile.push(p);
            } else {
                if (pile.isEmpty()) return false;

                char v = pile.pop();

                if (p == ')' && v != '(') return false;
                if (p == '}' && v != '{') return false;
                if (p == ']' && v != '[') return false;
            }
        }

        return pile.isEmpty();
    }
}
