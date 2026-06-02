class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
       for(int i=0;i<landStartTime.length;i++)
       {
        int fin=landStartTime[i]+landDuration[i];
        for(int j=0;j<waterStartTime.length;j++)
        {
            int water=Math.max(fin,waterStartTime[j]);
            int bh=water+waterDuration[j];
            if(bh<min)
            {
                min=bh;
            }
        }
       } 
       for(int i=0;i<waterStartTime.length;i++)
       {
        int fin=waterStartTime[i]+waterDuration[i];
        for(int j=0;j<landStartTime.length;j++)
        {
            int land=Math.max(fin,landStartTime[j]);
            int bh=land+landDuration[j];
            if(bh<min)
            {
                min=bh;
            }
        }
       } 
       
       return min;
    }
}