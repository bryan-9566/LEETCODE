class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> bry=new ArrayList<>();
        int t=0,l=0,r=matrix[0].length-1,b=matrix.length-1;
        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++)
            {
                bry.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                bry.add(matrix[i][r]);
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    bry.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    bry.add(matrix[i][l]);
                }
                l++;
            }
        }
        return bry;
    }
}