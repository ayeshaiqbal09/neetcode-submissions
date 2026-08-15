class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<int[]> st = new Stack<>();
        int n = temp.length, res[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temp[i] > st.peek()[0]) {
                int pair[] = st.pop();
                int ind = pair[1];
                res[ind] = i - ind;
            }
            st.push(new int[] {temp[i], i});
        }
        return res;
    }
}
