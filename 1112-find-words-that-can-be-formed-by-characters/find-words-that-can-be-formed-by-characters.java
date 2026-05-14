class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] hash=new int[26];
        int maxcnt=0;
        for(int i=0;i<chars.length();i++)
        {
            hash[chars.charAt(i)-'a']++;
        }
        for(String s:words)
        {
            String word=s;
            int[] bry=hash.clone();
            boolean hem=true;
            for(int i=0;i<word.length();i++)
            {
                if(bry[word.charAt(i)-'a']>0)
                {
                    bry[word.charAt(i)-'a']--;
                }
                else
                {
                    hem=false;
                    break;
                }
            }
            if(hem)
            {
                maxcnt+=word.length();
            }
        }
        return maxcnt;
    }
}