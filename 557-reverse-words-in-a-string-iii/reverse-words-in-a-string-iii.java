class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        String bry="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            bry+=reverse(word);
            if(i!=words.length-1)
            {
                bry+=" ";
            }
        }
        return bry;
    }
    public String reverse(String s)
    {
        char[] bry=s.toCharArray();
        int i=0,j=bry.length-1;
        while(i<j)
        {
            char temp=bry[i];
            bry[i]=bry[j];
            bry[j]=temp;
            i++;
            j--;
        }
        return new String(bry);
    }
}