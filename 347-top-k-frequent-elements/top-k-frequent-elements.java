class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> bh=new HashMap<>();
        int[] h=new int[k];
        int hb=0;
        for(int i=0;i<nums.length;i++)
        {
            bh.put(nums[i],bh.getOrDefault(nums[i],0)+1);
        }
        while(!bh.isEmpty())
        {
            int max=0;
            int val=0;
            for (Map.Entry<Integer,Integer> e:bh.entrySet())
            {
                if(e.getValue()>max)
                {
                    max=e.getValue();
                    val=e.getKey();
                }
            }
            h[hb++]=val;
            bh.remove(val);
            k--;
            if(k==0)
            {
                break;
            }
        }
        return h;
    }
}