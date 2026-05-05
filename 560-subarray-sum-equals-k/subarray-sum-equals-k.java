class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> bry=new HashMap<>();
        int sum=0,cnt=0;
        bry.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem=sum-k;
            if(bry.containsKey(rem))
            {
                cnt+=bry.get(rem);
            }
            if(bry.containsKey(sum))
            {
                bry.put(sum,bry.get(sum)+1);
            }
            else
            {
                bry.put(sum,1);
            }
        }
        return cnt;
    }
}