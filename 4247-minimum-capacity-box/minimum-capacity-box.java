class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int max=200,in=-1;
        for(int i=0;i<capacity.length;i++)
        {
            if(capacity[i]>=itemSize && capacity[i]<max)
            {
                max=capacity[i];
                in=i;
            }
        }
        return in;
    }
}