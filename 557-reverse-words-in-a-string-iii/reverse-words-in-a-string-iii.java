class Solution {
    public String reverseWords(String s) {
        String[] bry=s.split(" ");
        for(int i=0;i<bry.length;i++)
        {
            bry[i]=reverse(bry[i]);
        }
        String a="";
        for(int i=0;i<bry.length;i++)
        {
            a+=bry[i];
            if(i!=bry.length-1)
            {
                a+=" ";
            }
            
        }
        return a;
        
    }
    public String reverse(String bh)
    {
        int i=0,j=bh.length()-1;
        char[] h=bh.toCharArray();
        while(i<j)
        {
            char temp=h[i];
            h[i]=h[j];
            h[j]=temp;
            i++;
            j--;
        }
        return new String(h);
    }
}