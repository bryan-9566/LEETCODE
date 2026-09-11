class Solution {
    public void rotate(int[][] mat) {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i+1;j<mat[i].length;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<mat.length;i++)
        {
            int l=0,r=mat[i].length-1;
            while(l<r)
            {
                int temp=mat[i][l];
                mat[i][l]=mat[i][r];
                mat[i][r]=temp;
                l++;
                r--;
            }
        }
        
    }
}