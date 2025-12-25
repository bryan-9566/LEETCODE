class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> bry=new HashSet<>();
        HashSet<Integer> hem=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            bry.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(bry.contains(nums2[i]))
            {
                hem.add(nums2[i]);
            }
        }
        int[] hembry=new int[hem.size()];
        int c=0;
        for(int i: hem)
        {
            hembry[c++]=i;
        }
        return hembry;
    }
}