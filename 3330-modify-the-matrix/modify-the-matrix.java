class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] bry=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==-1)
                {
                    int max=Integer.MIN_VALUE;
                    for(int k=0;k<r;k++)
                    {
                        if(matrix[k][j]>max)
                        {
                            max=matrix[k][j];
                        }
                    }
                    bry[i][j]=max;
                }
                else
                {
                    bry[i][j]=matrix[i][j];
                }
            }
        }
        return bry;
    }
}