class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)
        {
            return 0;
        }
        HashSet<Integer> bh=new HashSet<>();
        int max=0;
        for(int i:arr)
        {
            bh.add(i);
        }
        for(int x:bh)
        {
            int cnt=0;
            if(!bh.contains(x-1))
            {
                cnt=1;
                while(bh.contains(++x))
                {
                    cnt++;
                }
            }
            if(cnt>max)
            {
                max=cnt;
            }
        }
        return max;
    }
}