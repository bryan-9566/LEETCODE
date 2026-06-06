class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ls=new int[nums.length];
        int[] rs=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                ls[i]=0;
            }
            else
            {
                int a=0;
                while(a<i)
                {
                    ls[i]+=nums[a++];
                }
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i==nums.length-1)
            {
                rs[i]=0;
            }
            else
            {
                int a=nums.length-1;
                while(i<a)
                {
                    rs[i]+=nums[a--];
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=Math.abs(ls[i]-rs[i]);
        }
        
        return nums;
    }
}