class Solution {
    public int[] sortArrayByParityII(int[] nums) {
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
        int b=0,h=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=even[b++];
            }
            else
            {
                nums[i]=odd[h++];
            }
        }
        return nums;
    }
}