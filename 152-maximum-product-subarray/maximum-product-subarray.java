class Solution {
    public int maxProduct(int[] nums) {
        int prepro=1,suffpro=1,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(prepro==0)
             prepro=1;
            if(suffpro==0)
             suffpro=1;
            prepro*=nums[i];
            suffpro*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(prepro,suffpro));
        }
        return max;
    }
}