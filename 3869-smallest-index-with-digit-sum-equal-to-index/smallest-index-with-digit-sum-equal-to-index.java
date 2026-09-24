class Solution {
    public int smallestIndex(int[] nums) {
        int in=-1;
        for(int i=0;i<nums.length;i++)
        {
            boolean bry=dig(nums[i],i);
            if(bry)
            {
                if(in==-1 || in>i)
                {
                    in=i;
                }
            }
        }
        return in;
    }
    public boolean dig(int num,int in)
    {
        int sum=0;
        while(num>0)
        {
            int r=num%10;
            sum+=r;
            num/=10;
        }
        return sum==in;
    }
}