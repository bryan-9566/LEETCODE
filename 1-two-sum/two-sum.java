class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> bry=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int req=target-nums[i];
            if(bry.containsKey(req))
            {
                return new int[] {bry.get(req),i};
            }
            else
            {
                bry.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}