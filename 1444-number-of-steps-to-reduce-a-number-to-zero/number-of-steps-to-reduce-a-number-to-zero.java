class Solution {
    public int numberOfSteps(int num) {
        return bry(num,0);
    }
    public int bry(int n,int s)
    {
        if(n==0)
         return s;
        if(n%2==0)
         return bry(n/2,++s);
        return bry(n-1,++s);
    }
}