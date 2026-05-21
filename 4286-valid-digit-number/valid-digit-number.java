class Solution {
    public boolean validDigit(int n, int x) {
        String bry=String.valueOf(n);
        if(bry.charAt(0)-'0'==x)
        {
            return false;
        }
        for(char hem:bry.toCharArray())
        {
            if(hem-'0'==x)
            {
                return true;
            }
        }
        return false;
    }
}