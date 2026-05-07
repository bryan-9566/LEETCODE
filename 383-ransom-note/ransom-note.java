class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> bry=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            bry.put(ch,bry.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch=ransomNote.charAt(i);
            if(bry.containsKey(ch))
            {
                if(bry.get(ch)>0)
                {
                    int cnt=bry.get(ch);
                    cnt--;
                    bry.put(ch,cnt);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}