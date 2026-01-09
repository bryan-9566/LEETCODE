class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=bryan(nums,target,true);
        if(ans[0]!=-1)
        {
            ans[1]=bryan(nums,target,false);
        }
        return ans;
    }
    public int bryan(int[] a,int t,boolean bry)
    {
        int s=0;
        int e=a.length-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(t>a[mid])
            {
                s=mid+1;
            }
            else if(t<a[mid])
            {
                e=mid-1;
            }
            else
            {
                ans=mid;
                if(bry)
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
        
        }
        return ans;
    }
}