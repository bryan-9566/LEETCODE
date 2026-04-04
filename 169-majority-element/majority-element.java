class Solution {
    public int majorityElement(int[] nums) {
        int el=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(c==0)
            {
                c=1;
                el=nums[i];
            }
            else if(nums[i]==el)
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        int bry=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==el)
            {
                bry++;
            }
        }
        if(bry>(nums.length/2))
        {
           return el;
        }
        return -1;
    }
}