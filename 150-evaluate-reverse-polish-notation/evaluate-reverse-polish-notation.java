class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
            {
                int op1=s.pop();
                int op2=s.pop();
                if(tokens[i].equals("+"))
                 s.push(op1+op2);
                else if(tokens[i].equals("-"))
                 s.push(op2-op1);
                else if(tokens[i].equals("*"))
                 s.push(op1*op2);
                else
                 s.push(op2/op1);
            }
            else
            {
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}