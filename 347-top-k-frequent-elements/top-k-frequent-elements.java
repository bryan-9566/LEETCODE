class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> bh=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
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
            arr.add(val);
            bh.remove(val);
            k--;
            if(k==0)
            {
                break;
            }
        }
        int[] h=new int[arr.size()];
        for(int i=0;i<h.length;i++)
        {
            h[i]=arr.get(i);
        }
        return h;
    }
}