class Solution {
    public int[][] merge(int[][] intervals) {
       List<List<Integer>> bry=new ArrayList<>();
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       for(int[] h:intervals)
       {
         if(bry.isEmpty() || bry.get(bry.size()-1).get(1)<h[0])
         {
            bry.add(Arrays.asList(h[0],h[1]));
         }
         else
         {
            int end=bry.get(bry.size()-1).get(1);
            bry.get(bry.size()-1).set(1,Math.max(end,h[1]));
         }
       }
       int[][] hem=new int[bry.size()][2];
       for(int i=0;i<hem.length;i++)
       {
        hem[i][0]=bry.get(i).get(0);
        hem[i][1]=bry.get(i).get(1);
       }
       return hem;
    }
}