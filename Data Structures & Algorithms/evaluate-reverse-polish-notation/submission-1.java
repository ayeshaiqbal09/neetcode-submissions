class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/")
                || tokens[i].equals("*")) {
                if (!st.isEmpty()) {
                    int a = st.pop();
                    int b = st.pop();
                    if (tokens[i].equals("+"))
                        sum = b + a;
                    else if (tokens[i].equals("-"))
                        sum = b - a;
                    else if (tokens[i].equals("*"))
                        sum = b * a;
                    else
                        sum = b / a;
                    st.push(sum);
                }
            } else
                st.push(Integer.parseInt(tokens[i]));
            sum=0;
        }
        return st.pop();
    }
}
