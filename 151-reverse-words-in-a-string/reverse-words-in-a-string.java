class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] bh=s.split("\\s+");
        StringBuilder bry=new StringBuilder();
        for(int i=bh.length-1;i>=0;i--)
        {
            bry.append(bh[i]);
            if(i!=0)
            {
                bry.append(" ");
            }
        }
        return new String(bry);
    }
}