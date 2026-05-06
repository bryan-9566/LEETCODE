class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] hem=s.split(" ");
        if(pattern.length()!=hem.length)
        {
            return false;
        }
        HashMap<Character,String> bry=new HashMap<>();
        for(int i=0;i<hem.length;i++)
        {
            char ch=pattern.charAt(i);
            if(bry.containsKey(ch))
            {
                if(hem[i].equals(bry.get(ch)))
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
                if(bry.containsValue(hem[i]))
                {
                    return false;
                }
                else
                {
                    bry.put(ch,hem[i]);
                }
            }
        }
        return true;
    }
}