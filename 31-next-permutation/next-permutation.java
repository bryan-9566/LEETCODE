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
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>in;i--)
        {
            if(nums[i]>nums[in])
            {
                int temp=nums[in];
                nums[in]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        reverse(nums,in+1,nums.length-1);
    }
    public void reverse(int[] a,int s,int e)
    {
        while(s<e)
        {
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
}