class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> bry=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(bry.contains(nums[i]))
            {
                return nums[i];
            }
            bry.add(nums[i]);
        }
        return -1;
    }
}