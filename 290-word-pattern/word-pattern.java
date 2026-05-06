class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> bry=new HashMap<>();
        HashMap<String,Character> hem=new HashMap<>();
        String[] st=s.split(" ");
        if(pattern.length()!=st.length)
        {
            return false;
        }
        for(int i=0;i<st.length;i++)
        {
            char ch=pattern.charAt(i);
            String word=st[i];
            if(bry.containsKey(ch))
            {
                if(!word.equals(bry.get(ch)))
                {
                    return false;
                }
            }
            else
            {
                bry.put(ch,word);
            }
            if(hem.containsKey(word))
            {
                if(!(ch==hem.get(word)))
                {
                    return false;
                }
            }
            else
            {
                hem.put(word,ch);
            }
        }
        return true;
    }
}