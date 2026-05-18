class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k)
        {
            return -1;
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<bloomDay.length;i++)
        {
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int low=min,high=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(find(bloomDay,mid,m,k))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            
        }
        return ans;
    }
    public boolean find(int[] h,int day,int m,int k)
    {
        int bou=0,cnt=0;
        for(int i=0;i<h.length;i++)
        {
            if(h[i]<=day)
            {
                cnt++;
            }
            else
            {
                bou+=cnt/k;
                cnt=0;
            }
        }
        bou+=cnt/k;
        return bou>=m;
    }
}