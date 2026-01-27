class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int oddc=0;
        int evenc=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
             evenc++;
            else
             oddc++;
        }
        int[] odd=new int[oddc];
        int[] even=new int[evenc];
        int e=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                
                even[e++]=nums[i];
            }
        }
        int o=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                odd[o++]=nums[i];
            }
        }
        int ec;
        for(ec=0;ec<even.length;ec++)
        {
            nums[ec]=even[ec];
        }
        int ey=0;
        for(int i=ec;i<nums.length;i++)
        {
            nums[i]=odd[ey++];
        }
        return nums;
        
    }
}