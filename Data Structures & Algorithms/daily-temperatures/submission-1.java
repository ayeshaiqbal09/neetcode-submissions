class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int n = temp.length, res[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temp[st.peek()] <= temp[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? 0 : st.peek() - i;
            st.push(i);
        }
        return res;
    }
}
