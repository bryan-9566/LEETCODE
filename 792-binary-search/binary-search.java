class Solution {
    public int search(int[] nums, int target) {
        return bsearch(nums,0,nums.length-1,target);
    }
    public int bsearch(int[] a,int low,int high,int tar)
    {
        if(low>high)
        {
            return -1;
        }
        int mid=(low+high)/2;
        if(a[mid]==tar)
        {
            return mid;
        }
        else if(a[mid]>tar)
        {
            return bsearch(a,low,mid-1,tar);
        }
        else
        {
            return bsearch(a,mid+1,high,tar);
        }
    }
}