class MinStack {
    long min=Integer.MAX_VALUE;
    Stack<Long> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty())
        {
            min= val;
            st.push((long)val);

        }
        else
        {
            if(val<min)
            {
                st.push(2L*val-min);
                min=val;
            }
            else
            st.push((long)val);
        }
    }
    
    public void pop() {
        if(st.isEmpty())
        {
            min=Long.MAX_VALUE;
            return;
        }
        long top=st.pop();
        if(top<min)
        {
            min=2*min-top;
        }
    }
    
    public int top() {
        if(st.isEmpty())return -1;
        if(st.peek()<min)return (int)min;
        else
        return st.peek().intValue();
    }
    
    public int getMin() {
        if (st.isEmpty())
        return -1;
        
        return (int)min;
    }
}
