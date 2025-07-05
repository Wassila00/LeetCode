class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> pile = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int second = pile.pop();
                int first = pile.pop();
                int result = 0;

                switch (token) {
                    case "+": result = first + second; break;
                    case "-": result = first - second; break;
                    case "*": result = first * second; break;
                    case "/": result = first / second; break;
                }

                pile.push(result);
            } else {
                pile.push(Integer.parseInt(token));
            }
        }

        return pile.pop();
    }
}
