class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> hem=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            hem.add(index[i],nums[i]);
        }
        int[] arr=new int[hem.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=hem.get(i);
        }
        return arr;
    }
}