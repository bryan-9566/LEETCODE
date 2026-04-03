class Solution {
    public int singleNumber(int[] nums) {
        int bry=0;
        for(int n:nums)
        {
            bry^=n;
        }
        return bry;
    }
}