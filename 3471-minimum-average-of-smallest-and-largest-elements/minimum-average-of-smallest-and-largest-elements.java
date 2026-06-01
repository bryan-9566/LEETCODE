class Solution {
    public double minimumAverage(int[] nums) {
       Arrays.sort(nums);
       double min=Double.MAX_VALUE;
       int i=0,j=nums.length-1,k=0;
       while(i<j)
       {
        double bry=(nums[i]+nums[j])/2.0;
        min=Math.min(bry,min);
        i++;
        j--;
       }
       return min;
    }
}