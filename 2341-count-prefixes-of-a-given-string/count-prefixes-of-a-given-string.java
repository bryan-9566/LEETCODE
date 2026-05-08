class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt=0;
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            if(word.length()>s.length())
            {
                continue;
            }
            int bry=1;
            for(int h=0;h<word.length();h++)
            {
                if(word.charAt(h)!=s.charAt(h))
                {
                    bry=0;
                    break;
                }
            }
            if(bry==1)
            {
                cnt++;
            }
        }
        return cnt;
    }
}