class Solution {
    public String reversePrefix(String s, int k) {
        char[] bry=s.toCharArray();
        int i=0,j=k-1;
        while(i<j)
        {
            char ch=bry[i];
            bry[i]=bry[j];
            bry[j]=ch;
            i++;
            j--;
        }
        return new String(bry);
    }
}