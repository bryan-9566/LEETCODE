class Solution {
    public double minimumAverage(int[] nums) {
       Arrays.sort(nums);
       double[] bry=new double[nums.length/2];
       int i=0,j=nums.length-1,k=0;
       while(i<j)
       {
        bry[k++]=(nums[i]+nums[j])/2.0;
        i++;
        j--;
       }
       double min=Double.MAX_VALUE;
       for(int h=0;h<bry.length;h++)
       {
        min=Math.min(bry[h],min);
       }
       return min;
    }
}