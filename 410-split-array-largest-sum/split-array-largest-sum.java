class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE,high=0;
        int ans=-1;
        if(nums.length<k)
        {
            return -1;
        }
        for(int i=0;i<nums.length;i++)
        {
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(find(nums,mid)<=k)
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
    public int find(int[] a,int pages)
    {
        int s=1,cpages=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]+cpages<=pages)
            {
                cpages+=a[i];
            }
            else
            {
                s++;
                cpages=a[i];
            }
        }
        return s;
    }
}