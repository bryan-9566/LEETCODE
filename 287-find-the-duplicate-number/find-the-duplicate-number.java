class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int corr=nums[i]-1;
            if(nums[i]!=nums[corr])
            {
                int temp=nums[i];
                nums[i]=nums[corr];
                nums[corr]=temp;
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                return nums[j];
            }
        }
        return -1;
    }
}