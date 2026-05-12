class Solution {
    public int[] separateDigits(int[] nums) {
      List<Integer> bry=new ArrayList<>();
      for(int i=nums.length-1;i>=0;i--)
      {
        if(nums[i]>=10)
        {
            int t=nums[i];
            while(t>0)
            {
                int l=t%10;
                bry.add(l);
                t=t/10;
            }
        }
        else
        {
            bry.add(nums[i]);
        }
      }  
      int[] h=new int[bry.size()];
      for(int i=0;i<h.length;i++)
      {
        h[i]=bry.get(bry.size()-1-i);
      }
      return h;
    }
}