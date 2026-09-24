class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> bry=new HashMap<>();
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i-1]==key)
        {
            bry.put(nums[i],bry.getOrDefault(nums[i],0)+1);
        }
       } 
       int max=Integer.MIN_VALUE;
       int val=-1;
       for(Map.Entry<Integer,Integer> e:bry.entrySet())
       {
        if(e.getValue()>max)
        {
            max=e.getValue();
            val=e.getKey();
        }
       }
       return val;
    }
}