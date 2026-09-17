class Solution {
    public String removeStars(String s) {
        Stack<Character> bry=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                bry.pop();
            }
            else
            {
                bry.push(s.charAt(i));
            }
        }
        String h="";
        while(!bry.isEmpty())
        {
            h+=bry.pop();
        }
        h=rev(h);
        return h;
    }
    public String rev(String s)
    {
        char[] b=s.toCharArray();
        int i=0,j=b.length-1;
        while(i<j)
        {
            char temp=b[i];
            b[i]=b[j];
            b[j]=temp;
            i++;
            j--;
        }
        return new String(b);
    }
}