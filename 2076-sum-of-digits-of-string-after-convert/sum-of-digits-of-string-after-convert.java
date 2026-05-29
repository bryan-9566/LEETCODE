class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int num=(s.charAt(i)-'a')+1;
            while(num!=0)
            {
                int r=num%10;
                sum+=r;
                num=num/10;
            }
        }
        while(k>1)
        {
            int ns=0;
            while(sum!=0)
            {
                int r=sum%10;
                ns+=r;
                sum=sum/10;
            }
            sum=ns;
            k--;
        }
        return sum;
    }
}