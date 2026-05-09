class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> bry=new HashSet<>();
        if(nums.length==0)
         return 0;
        for(int i=0;i<nums.length;i++)
        {
            bry.add(nums[i]);
        }
        int longest=1;
        for(int i:bry)
        {
            int ele=i;
            int count=0;
            if(!bry.contains(ele-1))
            {
                count=1;
                while(bry.contains(ele+1))
                {
                    ele=ele+1;
                    count++;
                }
            }
            if(count>longest)
            {
                longest=count;
            }
        }
        return longest;
    }
}