class Solution {
    public List<String> commonChars(String[] words) {
        int[] bry=new int[26];
        List<String> hem=new ArrayList<>();
        for(int i=0;i<words[0].length();i++)
        {
            bry[words[0].charAt(i)-'a']++;
        }
        for(int i=1;i<words.length;i++)
        {
            String word=words[i];
            int[] curr=new int[26];
            for(int j=0;j<word.length();j++)
            {
                curr[word.charAt(j)-'a']++;
            }
            for(int k=0;k<26;k++)
            {
                bry[k]=Math.min(bry[k],curr[k]);
            }
        }
        for(int i=0;i<26;i++)
        {
            while(bry[i]>0)
            {
                char ch=(char)(i+'a');
                hem.add(String.valueOf(ch));
                bry[i]--;
            }
        }
        return hem;
    }
}