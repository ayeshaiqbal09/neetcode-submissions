class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> ast=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='(')
            {
                st.push(i);
                
                
                
            }
            else if(ch=='*')
                ast.push(i);
                
            else
            {
                if (st.isEmpty() && ast.isEmpty()) return false;
                if(!st.isEmpty())
                st.pop();
                else
                ast.pop();
                
            }
        }
        while(!st.isEmpty() && !ast.isEmpty())
        {
            if(st.pop()>ast.pop())return false;
        }
        return st.isEmpty();
    }
}
