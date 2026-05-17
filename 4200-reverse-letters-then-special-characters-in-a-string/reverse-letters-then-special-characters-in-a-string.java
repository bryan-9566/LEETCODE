class Solution {
    public String reverseByType(String s) {
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
        i=0;
        j=bry.length-1;
        while(i<j)
        {
            if(Character.isLetter(bry[i]))
            {
                i++;
            }
            else if(Character.isLetter(bry[j]))
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
        System.out.print(new String(bry));
        return String.valueOf(bry);
    }
}