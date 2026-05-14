class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> bry=new HashMap<>();
        HashMap<Character,Character> hem=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char bh=t.charAt(i);
            if(bry.containsKey(ch))
            {
                if(bry.get(ch)==bh)
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                bry.put(ch,bh);
            }
            if(hem.containsKey(bh))
            {
                if(hem.get(bh)==ch)
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                hem.put(bh,ch);
            }

        }
        return true;
    }
}