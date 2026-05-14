class Solution {
    public int romanToInt(String s) {
      int sum=0;
      HashMap<Character,Integer> bry=new HashMap<>();
      bry.put('I', 1);
      bry.put('V', 5);
      bry.put('X', 10);
      bry.put('L', 50);
      bry.put('C', 100);
      bry.put('D', 500);
      bry.put('M', 1000);
      for(int i=0;i<s.length();i++)
      {
        int curr=bry.get(s.charAt(i));
        if(i<s.length()-1 && curr<bry.get(s.charAt(i+1)))
        {
            sum=sum-curr;
        }
        else
        {
            sum+=curr;
        }
      }
      return sum;
    }
}