class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> bry=new HashSet<>();
        int l=0;
        int max=0;
        for(int r=0;r<s.length();r++)
        {
            char c=s.charAt(r);
            while(bry.contains(c))
            {
                bry.remove(s.charAt(l));
                l++;
            }
            bry.add(c);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}