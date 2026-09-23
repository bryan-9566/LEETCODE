class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> bry=new ArrayList<>();
        bry.add(words[0]);
        for(int i=1;i<words.length;i++)
        {
            boolean b=check(words[i],words[i-1]);
            if(!b)
            {
                bry.add(words[i]);
            }
        }
        return bry;
    }
    public boolean check(String a,String b)
    {
        if(a.length()!=b.length())
        {
            return false;
        }
        int[] hash=new int[26];
        for(int i=0;i<a.length();i++)
        {
            hash[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            hash[b.charAt(i)-'a']--;
        }
        for(int i=0;i<a.length();i++)
        {
            if(hash[a.charAt(i)-'a']!=0)
            {
                return false;
            }
        }
        return true;
    }
}