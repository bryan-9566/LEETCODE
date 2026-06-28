class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int[] bry=new int[nums.length];
      for(int i=0;i<nums.length;i++)
      {
        boolean h=false;
        for(int j=i+1;j<=i+nums.length-1;j++)
        {
            int in=j%nums.length;
            if(nums[in]>nums[i])
            {
                bry[i]=nums[in];
                h=true;
                break;
            }
        }
        if(!h)
        {
            bry[i]=-1;
        }
      }  
      return bry;
    }
}