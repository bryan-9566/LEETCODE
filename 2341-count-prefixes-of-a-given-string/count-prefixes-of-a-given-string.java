class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt=0;
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            if(s.startsWith(word))
            {
                cnt++;
            }
        }
        return cnt;
    }
}