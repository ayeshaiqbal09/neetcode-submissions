class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(ch==')'||ch==']'||ch=='}')
            {
                if(st.isEmpty())return false;

                if(st.peek()=='(' && ch==')')st.pop();
                else if(st.peek()=='[' && ch==']')st.pop();
                else if(st.peek()=='{' && ch=='}')st.pop();
                else return false;
            }
            else
            st.push(ch);

            i++;
        }
        return st.isEmpty();
    }
}
