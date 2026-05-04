class Solution {
    public int findLucky(int[] arr) {
      int[] hem=new int[501];
      int max=-1;
      for(int i=0;i<arr.length;i++)
      {
        hem[arr[i]]++;
      }
      for(int i=1;i<hem.length;i++)
      {
        if(hem[i]==i)
        {
            max=Math.max(max,i);
        }
      }
      return max;
    }
}