class Solution {
    public void nextPermutation(int[] nums) {
        int in=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                in=i;
                break;
            }
        }
        if(in==-1)
        {
            rev(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>in;i--)
        {
            if(nums[i]>nums[in])
            {
                int temp=nums[i];
                nums[i]=nums[in];
                nums[in]=temp;
                break;
            }
        }
        rev(nums,in+1,nums.length-1);
    }
    public void rev(int[] a,int i,int j)
    {
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}