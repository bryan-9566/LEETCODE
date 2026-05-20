class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxcnt=0,index=0;
        for(int i=0;i<mat.length;i++)
        {
            int cnt=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    cnt++;
                }
            }
            if(cnt>maxcnt)
            {
                maxcnt=cnt;
                index=i;
            }
        }
        return new int[] {index,maxcnt};
    }
}