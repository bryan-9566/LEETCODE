class Solution {
    public String replaceDigits(String s) {
        StringBuilder bry=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                bry.append(s.charAt(i));
            }
            else
            {
                char h=s.charAt(i);
                int shift=h-'0';
                bry.append((char)(bry.charAt(bry.length()-1)+shift));
            }
        }
        return new String(bry);
    }
}