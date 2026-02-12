class Solution {
    public int search(int[] nums, int target) {
        return sol(nums,target,0,nums.length-1);
    }
    public int sol(int[] a,int t,int s,int e)
    {
        int m=s+(e-s)/2;
        if(s>e)
         return -1;
        if(a[m]==t)
         return m;
        if(a[s]<=a[m])
        {
            if(t>=a[s]&&t<=a[m])
            {
                return sol(a,t,s,m-1);
            }
            else
            {
                return sol(a,t,m+1,e);
            }
        }
        if(t>=a[m] && t<=a[e])
        {
            return sol(a,t,m+1,e);
        }
        return sol(a,t,s,m-1);
    }
}