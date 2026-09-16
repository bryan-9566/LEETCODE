class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<List<Integer>> bh=new ArrayList<>();
        for(int[] b:intervals)
        {
            if(bh.isEmpty() || bh.get(bh.size()-1).get(1)<b[0])
            {
                bh.add(Arrays.asList(b[0],b[1]));
            }
            else
            {
                int last=bh.size()-1;
                int end=bh.get(last).get(1);
                bh.get(last).set(1,Math.max(end,b[1]));
            }
        }
        int[][] bry=new int[bh.size()][2];
        for(int i=0;i<bry.length;i++)
        {
            bry[i][0]=bh.get(i).get(0);
            bry[i][1]=bh.get(i).get(1);
        }
        return bry;
    }
}