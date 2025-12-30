class Solution {
    public String interpret(String command) {
        StringBuilder hb=new StringBuilder();
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            {
                hb.append('G');
            }
            else if(command.charAt(i)=='(')
            {
                if(command.charAt(i+1)==')')
                {
                    hb.append('o');
                    i++;
                }
                else
            {
                hb.append("al");
                i+=3;
            }
            }
        }
        return hb.toString();
    }
}