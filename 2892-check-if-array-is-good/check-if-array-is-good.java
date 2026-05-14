class Solution {
    public boolean isGood(int[] nums) {
     int max=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]>max)
        {
            max=nums[i];
        }
     }   
     int[] hash=new int[max+1];
     for(int i=0;i<nums.length;i++)
     {
        hash[nums[i]]++;
     }
     for(int i=1;i<hash.length-1;i++)
     {
        if(hash[i]!=1)
        {
            return false;
        }
     }
     if(hash[max]!=2)
     {
        return false;
     }

     return true;
    }
}