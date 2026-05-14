class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> bry=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(bry.containsKey(s.charAt(i)))
            {
                if(bry.get(s.charAt(i))==t.charAt(i))
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
                if(bry.containsValue(t.charAt(i)))
                {
                    return false;
                }
                bry.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}