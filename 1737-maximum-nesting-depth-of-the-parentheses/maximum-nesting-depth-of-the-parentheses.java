class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE,count=0;
        for(char bry:s.toCharArray())
        {
            if(bry=='(')
            {
                count++;
            }
            else if(bry==')')
            {
                count--;
            }
            max=Math.max(max,count);
        } 
        return max;
    }
}