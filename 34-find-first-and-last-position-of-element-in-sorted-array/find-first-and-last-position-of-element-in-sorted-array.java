class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1,last=-1;
        first=s1(nums,target);
        if(first==-1)
        {
            return new int[] {-1,-1};
        }
        last=s2(nums,target);
        return new int[] {first,last};
    }
    public int s1(int[] a,int x)
    {
        int ans=-1;
        int s=0,e=a.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(a[mid]==x)
            {
                ans=mid;
                e=mid-1;
            }
            else if(a[mid]<x)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }
    public int s2(int[] a,int x)
    {
        int ans=-1;
        int s=0,e=a.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(a[mid]==x)
            {
                ans=mid;
                s=mid+1;
            }
            else if(a[mid]<x)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }
}