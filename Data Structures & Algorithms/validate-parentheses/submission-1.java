class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        Deque<Character> dq = new ArrayDeque<>();
        int r = 0;
        while (r < s.length()) {
            char ch = s.charAt(r);
            if (ch == '}' || ch == ']' || ch == ')') {
                if (dq.isEmpty())
                    return false;

                if ((dq.peek() == '(' && ch == ')')
                    || (dq.peek() == '[' && ch == ']') || (dq.peek() == '{' && ch == '}')) dq.pop();

                else {
                    return false;
                }
            }
            else
            dq.push(ch);

            r++;
        }
        return dq.isEmpty();
    }
}
