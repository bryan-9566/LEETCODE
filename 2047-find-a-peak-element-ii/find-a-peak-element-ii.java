class Solution {
    public int[] findPeakGrid(int[][] mat) {
       int low=0,high=mat[0].length-1;
       while(low<=high)
       {
        int mid=low+(high-low)/2;
        int rin=find(mat,mid);
        int left=mid-1>=0?mat[rin][mid-1]:-1;
        int right=mid+1<mat[0].length?mat[rin][mid+1]:-1;
        if(mat[rin][mid]>left && mat[rin][mid]>right)
        {
            return new int[] {rin,mid};
        }
        else if(mat[rin][mid]<left)
        {
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
       } 
       return new int[] {-1,-1};
    }
    public int find(int[][] h,int col)
    {
        int max=Integer.MIN_VALUE;
        int in=-1;
        for(int i=0;i<h.length;i++)
        {
            if(h[i][col]>max)
            {
                max=h[i][col];
                in=i;
            }
        }
        return in;
    }
}