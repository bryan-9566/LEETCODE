class Solution {
    public String reverseOnlyLetters(String s) {
        char[] bry=s.toCharArray();
        int i=0,j=bry.length-1;
        while(i<j)
        {
            if(!Character.isLetter(bry[i]))
            {
                i++;
            }
            else if(!Character.isLetter(bry[j]))
            {
                j--;
            }
            else
            {
                char temp=bry[i];
                bry[i]=bry[j];
                bry[j]=temp;
                i++;
                j--;
            }
        }
        return new String(bry);
    }
}