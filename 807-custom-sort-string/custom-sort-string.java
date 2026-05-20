class Solution {
    public String customSortString(String order, String s) {
        StringBuilder bry=new StringBuilder();
        for(int i=0;i<order.length();i++)
        {
            char ch=order.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==ch)
                {
                    bry.append(ch);
                }
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(order.indexOf(s.charAt(i))==-1)
            {
                bry.append(s.charAt(i));
            }
        }
        System.out.println(bry);
        return new String(bry);
    }
}