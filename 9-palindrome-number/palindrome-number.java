class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int r,b=0;
        while(x>0)
        {
            r=x%10;
            b=b*10+r;
            x=x/10;
        }
        if(b==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}