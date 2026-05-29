class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(int i=0;i<details.length;i++)
        {
            String bry=details[i];
            char ch=bry.charAt(11);
            int age=(ch-'0')*10;
            char ch1=bry.charAt(12);
            int age1=ch1-'0';
            int fage=age+age1;
            if(fage>60)
            {
                cnt++;
            }
        }
        return cnt;
    }
}