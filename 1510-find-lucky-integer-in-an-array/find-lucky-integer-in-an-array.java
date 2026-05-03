class Solution {
    public int findLucky(int[] arr) {
      int[] hem=new int[501];
      int max=-1;
      for(int i=0;i<arr.length;i++)
      {
        hem[arr[i]]++;
      }
      for(int i=0;i<arr.length;i++)
      {
        if(hem[arr[i]]==arr[i])
        {
            max=Math.max(max,arr[i]);
        }
      }
      return max;
    }
}