class Solution {
    public int maxProduct(int[] nums) {
        int ppro=1,spro=1,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(ppro==0)
            {
                ppro=1;
            }
            if(spro==0)
            {
                spro=1;
            }
            ppro*=nums[i];
            spro*=nums[nums.length-1-i];
            max=Math.max(max,Math.max(ppro,spro));
        }
        return max;
    }
}