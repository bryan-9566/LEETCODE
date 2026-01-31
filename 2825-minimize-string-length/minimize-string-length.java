class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> sy=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            sy.add(s.charAt(i));
        }
        return sy.size();
    }
}