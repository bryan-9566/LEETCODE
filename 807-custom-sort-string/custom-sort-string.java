class Solution {
    public String customSortString(String order, String s) {
        StringBuilder hem=new StringBuilder();
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)-'a']++;
        }
        for(int i=0;i<order.length();i++)
        {
            char ch=order.charAt(i);
            while(hash[ch-'a']>0)
            {
                hem.append(ch);
                hash[ch-'a']--;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            while(hash[ch-'a']>0)
            {
                hem.append(ch);
                hash[ch-'a']--;
            }
        }
        return new String(hem);
    }
}