class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public void mergesort(int[] a,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid=(low+high)/2;
        mergesort(a,low,mid);
        mergesort(a,mid+1,high);
        merge(a,low,mid,high);
    }
    public void merge(int[] a,int low,int mid,int high)
    {
        int[] temp=new int[high-low+1];
        int left=low,right=mid+1;
        int k=0;
        while(left<=mid && right<=high)
        {
            if(a[left]<=a[right])
            {
                temp[k++]=a[left++];
            }
            else
            {
                temp[k++]=a[right++];
            }
        }
        while(left<=mid)
        {
            temp[k++]=a[left++];
        }
        while(right<=high)
        {
            temp[k++]=a[right++];
        }
        for(int i=low;i<=high;i++)
        {
            a[i]=temp[i-low];
        }
        return;
    }
}