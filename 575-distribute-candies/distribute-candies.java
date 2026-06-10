class Solution {
    public int distributeCandies(int[] candyType) {
      int limit=candyType.length/2;
      HashSet<Integer> bry=new HashSet<>();
      for(int i:candyType)
      {
        bry.add(i);
      }
      if(bry.size()<limit)
      {
        return bry.size();
      }
      return limit;
    }
}