class Solution {
    public boolean isValid(String s) {
        Stack<Character> bry=new Stack<>();
        for(char h:s.toCharArray())
        {
            if(h=='[' || h=='(' || h=='{')
            {
                bry.push(h);
            }
            else
            {
                if(bry.isEmpty())
                {
                    return false;
                }
                else
                {
                    char bh=bry.pop();
                    if((bh=='(' && h!=')') || (bh=='[' && h!=']') || (bh=='{' && h!='}') )
                    {
                        return false;
                    }
                }
            }
        }
        return bry.isEmpty();
    }
}