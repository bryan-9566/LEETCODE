class Solution {
    public String processStr(String s) {
            StringBuilder bry=new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='*' && bry.length()>0)
                {
                    bry.deleteCharAt(bry.length()-1);
                }
                else if(s.charAt(i)=='#')
                {
                    StringBuilder h=new StringBuilder(bry);
                    bry.append(h);
                }
                else if(s.charAt(i)=='%')
                {
                    bry=bry.reverse();
                }
                else if(Character.isLowerCase(s.charAt(i)))
                {
                    bry.append(s.charAt(i));
                }
            }
            return new String(bry);
    }
}