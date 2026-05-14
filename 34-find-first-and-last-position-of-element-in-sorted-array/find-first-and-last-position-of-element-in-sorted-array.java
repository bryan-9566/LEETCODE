class Solution {
    public int[] searchRange(int[] nums, int target) {
      int first=-1,last=-1;
      int n=nums.length;
      first=bfsearch(nums,n,target);
      if(first==-1)
      {
        return new int[] {first,last};
      }  
      last=blsearch(nums,n,target);
      return new int[] {first,last};
    }
    public int bfsearch(int[] a,int n,int x)
    {
        int first=-1;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(a[mid]>x)
            {
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
        int last=-1;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(a[mid]>x)
            {
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