class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
        }
        int low=1,high=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(find(nums,threshold,mid))
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
    public boolean find(int[] b,int th,int div)
    {
        int sum=0;
        for(int i=0;i<b.length;i++)
        {
            sum+=Math.ceil((double)b[i]/div);
        }
        return sum<=th;
    }
}