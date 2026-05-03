class Solution {
    public int findLucky(int[] arr) {
      int[] hem=new int[501];
      int max=0;
      for(int i=0;i<arr.length;i++)
      {
        hem[arr[i]]++;
      }
      for(int i=0;i<arr.length;i++)
      {
        int num=0;
        if(hem[arr[i]]==arr[i])
        {
            num=arr[i];
        }
        if(num>max)
        {
            max=num;
        }
      }
      if(max==0)
      {
        return -1;
      }
      return max;
    }
}