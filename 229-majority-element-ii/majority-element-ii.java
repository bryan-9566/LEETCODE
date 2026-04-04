class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> h=new ArrayList<>();
        int el1=0,el2=0;
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==el1)
            {
                c1++;
            }
            else if(nums[i]==el2)
            {
                c2++;
            }
            else if(c1==0)
            {
                c1=1;
                el1=nums[i];
            }
            else if(c2==0)
            {
                c2=1;
                el2=nums[i];
            }
            else 
            {
                c1--;
                c2--;
            }
        }
        int bry1=0,bry2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==el1)
            {
                bry1++;
            }
            else if(nums[i]==el2)
            {
                bry2++;
            }
        }
        if(bry1>(nums.length/3))
        {
           h.add(el1);
        }
        if(bry2>nums.length/3 && el1!=el2)
        {
            h.add(el2);
        }
        return h;
    }
}