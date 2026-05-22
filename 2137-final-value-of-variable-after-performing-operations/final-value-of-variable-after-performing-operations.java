class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int x=0;
       for(int i=0;i<operations.length;i++)
       {
        String hem=operations[i];
        if(hem.charAt(0)=='-')
        {
            --x;
        }
        else if(hem.charAt(0)=='+')
        {
            ++x;
        }
        else if(hem.charAt(0)=='X' && hem.charAt(1)=='+')
        {
            x++;
        }
        else
        {
            x--;
        }
       } 
       return x;
    }
}