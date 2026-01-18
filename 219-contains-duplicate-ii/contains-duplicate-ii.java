class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> bry=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(bry.containsKey(nums[i]))
            {
                if(i-bry.get(nums[i])<=k)
                {
                    return true;
                }
            }
            bry.put(nums[i],i);
        }
        return false;
    }
}