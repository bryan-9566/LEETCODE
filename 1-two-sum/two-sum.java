class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> bry=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int rem=target-nums[i];
            if(bry.containsKey(rem))
            {
                return new int[] {bry.get(rem),i};
            }
            bry.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}