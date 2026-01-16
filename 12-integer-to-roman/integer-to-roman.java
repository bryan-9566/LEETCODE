class Solution {
    public String intToRoman(int num) {
        int[] hem={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] bry={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String bryan="";
        for(int i=0;i<hem.length;i++)
        {
            while(num>=hem[i])
            {
                num-=hem[i];
                bryan+=bry[i];
            }
        }
        return bryan;
    }
}