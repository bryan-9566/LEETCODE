class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String bry="";
        for(String h:words)
        {
            char ch=h.charAt(0);
            bry+=ch;
        }
        return bry.equals(s);
    }
}