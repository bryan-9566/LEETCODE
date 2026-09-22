class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> bry=new ArrayList<>();
        int l=p.length();
        for(int i=0;i<s.length();i++)
        {
            if(i+l>s.length())
            {
                break;
            }
            String n=s.substring(i,i+l);
            boolean b=check(p,n);
            if(b)
            {
                bry.add(i);
            }
        }
        return bry;
    }
    public boolean check(String a,String b)
    {
        int[] hash=new int[26];
        for(int i=0;i<a.length();i++)
        {
            hash[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            hash[b.charAt(i)-'a']--;
        }
        for(int i=0;i<b.length();i++)
        {
            if(hash[a.charAt(i)-'a']!=0)
            {
                return false;
            }
        }
        return true;
    }
}