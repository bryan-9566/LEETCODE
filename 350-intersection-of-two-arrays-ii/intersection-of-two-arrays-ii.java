class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer> list=new ArrayList<Integer>();
       ArrayList<Integer> list1=new ArrayList<Integer>();
       for(int i=0;i<nums1.length;i++)
       {
        list.add(nums1[i]);
       } 
       for(int i=0;i<nums2.length;i++)
       {
        if(list.contains(nums2[i]))
        {
            list1.add(nums2[i]);
            list.remove(Integer.valueOf(nums2[i]));
        }
       }
       int[] arr=new int[list1.size()];
       int c=0;
       for(int i:list1)
       {
        arr[c]=i;
        c++;
       }
       return arr;
    }
}