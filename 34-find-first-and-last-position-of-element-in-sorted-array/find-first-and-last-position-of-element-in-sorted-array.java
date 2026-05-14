class Solution {
    public int[] searchRange(int[] nums, int target) {
      int first=-1,last=-1;
      int n=nums.length;
      first=bfsearch(nums,n,target);
      if(first==nums.length || nums[first]!=target)
      {
        return new int[] {-1,-1};
      }
      return new int[] {first,blsearch(nums,n,target)-1};
    }
    public int bfsearch(int[] a,int n,int x)
    {
        int first=n;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]>=x)
            {
                first=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return first;
    }
    public int blsearch(int[] a,int n,int x)
    {
        int last=n;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]>x)
            {
                last=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return last;
    }
}