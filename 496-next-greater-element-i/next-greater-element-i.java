class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> bry=new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            int max=nums2[i];
            boolean bh=false;
            for(int j=i+1;j<nums2.length;j++)
            {
                if(nums2[j]>max)
                {
                    bh=true;
                    bry.put(max,nums2[j]);
                    break;
                }
            }
            if(!bh)
            {
                bry.put(max,-1);
            }
        }
        int[] h=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            h[i]=bry.get(nums1[i]);
        }
        return h;
    }
}