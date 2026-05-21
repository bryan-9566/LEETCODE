class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int low=0,high=matrix.length*matrix[0].length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(matrix[mid/m][mid%m]==target)
            {
                return true;
            }
            else if(matrix[mid/m][mid%m]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
    }
}