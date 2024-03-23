class Solution {
    public boolean isValid(String s) {

        Stack<Character> parantheses = new Stack<Character>();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' )
                parantheses.push(s.charAt(i));

            else {
                if(parantheses.isEmpty())
                    return false;
                Character ch = (Character) parantheses.peek();

                if (s.charAt(i) == '}' && ch == '{')
                    parantheses.pop();

                else if (s.charAt(i) == ']' && ch == '[')
                    parantheses.pop();

                else if (s.charAt(i) == ')' && ch == '(')
                    parantheses.pop();
                else
                    return false;

            }
        }

        if (parantheses.isEmpty())
            return true;

        return false;
    }
}