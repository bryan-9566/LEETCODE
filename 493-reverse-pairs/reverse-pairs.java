class Solution {
    public int reversePairs(int[] nums) {
        int cnt=0;
        cnt+=mergesort(nums,0,nums.length-1);
        return cnt;
    }
    public int mergesort(int[] a,int low,int high)
    {
        int cnt=0;
        int mid=(low+high)/2;
        if(low>=high)
        {
            return cnt;
        }
        cnt+=mergesort(a,low,mid);
        cnt+=mergesort(a,mid+1,high);
        cnt+=count(a,low,mid,high);
        merge(a,low,mid,high);
        return cnt;
    }
    public int count(int[] a,int low,int mid,int high)
    {
        int cnt=0;
        int l=low,right=mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && a[i]>2L*a[right])
            {
                right++;
            }
            cnt+=right-(mid+1);
        }
        return cnt;

    }
    public void merge(int[] a,int low,int mid,int high)
    {
        int[] temp=new int[high-low+1];
        int l=low,r=mid+1,k=0;
        while(l<=mid && r<=high)
        {
            if(a[l]<=a[r])
            {
                temp[k++]=a[l++];
            }
            else
            {
                temp[k++]=a[r++];
            }
        }
        while(l<=mid)
        {
            temp[k++]=a[l++];
        }
        while(r<=high)
        {
            temp[k++]=a[r++];
        }
        for(int i=low;i<=high;i++)
        {
            a[i]=temp[i-low];
        }
    }
}