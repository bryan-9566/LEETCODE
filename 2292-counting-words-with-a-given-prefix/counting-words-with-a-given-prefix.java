class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt=0;
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            int bry=1;
            if(word.length()<pref.length())
            {
                continue;
            }
            for(int h=0;h<pref.length();h++)
            {
                if(word.charAt(h)!=pref.charAt(h))
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