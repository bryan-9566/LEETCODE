class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> bry=new HashMap<>();
       bry.put(0,1);
       int sum=0,cnt=0;
       for(int i=0;i<nums.length;i++)
       {
        sum+=nums[i];
        int rem=sum-k;
        if(bry.containsKey(rem))
        {
            cnt+=bry.get(rem);
        }
        bry.put(sum,bry.getOrDefault(sum,0)+1);
       }
       return cnt;
    }
}