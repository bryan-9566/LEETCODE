class Solution {
    public boolean areOccurrencesEqual(String s) {
       int[] hem=new int[26];
       for(int i=0;i<s.length();i++)
       {
        hem[s.charAt(i)-'a']++;
       } 
       int cnt=0;
       for(int i:hem)
       {
        if(i!=0)
        {
            cnt=i;
            break;
        }
       }
       for(int i:hem)
       {
        if(i!=0 && i!=cnt)
        {
            return false;
        }
       }
       return true;
    }
}