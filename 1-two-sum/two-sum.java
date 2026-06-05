class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> bh=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int req=target-nums[i];
            if(bh.containsKey(req))
            {
                return new int[] {bh.get(req),i};
            }
            else
            {
                bh.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}