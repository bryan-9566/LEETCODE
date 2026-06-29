class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] bry=new int[nums.length];
        Stack<Integer> bh=new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--)
        {
            while(!bh.isEmpty() && nums[i%nums.length]>=bh.peek())
            {
                bh.pop();
            }
            if(i<nums.length)
            {
                if(bh.isEmpty())
                {
                    bry[i]=-1;
                }
                else
                {
                    bry[i]=bh.peek();
                }
            }
            bh.push(nums[i%nums.length]);
        }
        return bry;
    }
}