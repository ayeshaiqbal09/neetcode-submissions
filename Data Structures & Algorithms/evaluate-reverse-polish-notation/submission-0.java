class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sc=new Stack<>();
       
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+") || tokens[i].equals("-")||tokens[i].equals("*")|| tokens[i].equals("/"))
            {
                if(!sc.isEmpty())
                {
                    int a=sc.pop();
                    int b=sc.pop();
                     int sum;
                   if (tokens[i].equals("+"))
                    sum= b + a;
                    else if(tokens[i].equals("-"))
                    sum= b-a;
                    else if(tokens[i].equals("*"))
                    sum=b*a;
                    else
                    sum=b/a;
                     sc.push(sum);
                }
                
               
            }
            else
            sc.push(Integer.parseInt(tokens[i]));
        }
        return sc.pop();
    }
}
