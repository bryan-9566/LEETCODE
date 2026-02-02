class Solution {
    public int[] findErrorNums(int[] nums) {
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
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
}