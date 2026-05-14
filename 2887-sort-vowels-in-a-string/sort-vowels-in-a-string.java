class Solution {
    public String sortVowels(String s) {
        char[] bry=s.toCharArray();
        int cnt=0;
        String vowels="AEIOUaeiou";
        for(int i=0;i<bry.length;i++)
        {
            if(vowels.indexOf(bry[i])!=-1)
            {
                cnt++;
            }
        }
        char[] a=new char[cnt];
        int in=0;
        for(int i=0;i<bry.length;i++)
        {
            if(vowels.indexOf(bry[i])!=-1)
            {
                a[in++]=bry[i];
            }
        }
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
        int j=0;
        for(int i=0;i<bry.length;i++)
        {
            if(vowels.indexOf(bry[i])!=-1)
            {
                bry[i]=a[j++];
            }
        }
        return new String(bry);
        
    }
}