class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] hash=new int[26];
        int[] hash1=new int[26];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)-'a']++;
        }
        for(int i=0;i<target.length();i++)
        {
            hash1[target.charAt(i)-'a']++;
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++)
        {
            if(hash1[i]>0)
            {
                min=Math.min(min,hash[i]/hash1[i]);
            }
        }
        return min;

    }
}