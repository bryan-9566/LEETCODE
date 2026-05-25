class Solution {
    public int minimumSwaps(int[] nums) {
        int cnt=0,bry=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                cnt++;
            }
        }
        for(int h=0;h<nums.length-cnt;h++)
        {
            if(nums[h]==0)
            {
                bry++;
            }
        }
        return bry;
    }
}