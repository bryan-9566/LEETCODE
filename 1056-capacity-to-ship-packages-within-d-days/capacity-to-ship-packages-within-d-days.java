class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<weights.length;i++)
        {
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max,high=sum;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(find(weights,mid)<=days)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
    public int find(int[] b,int cap)
    {
        int days=1,load=0;
        for(int i=0;i<b.length;i++)
        {
            if(load+b[i]>cap)
            {
                days++;
                load=b[i];
            }
            else
            {
                load+=b[i];
            }
        }
        return days;
    }
}