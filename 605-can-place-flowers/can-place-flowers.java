class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)
            {
                boolean el=(i==0) || (flowerbed[i-1]==0);
                boolean er=(i==flowerbed.length-1) || (flowerbed[i+1]==0);
                if(el && er)
                {
                    flowerbed[i]=1;
                    n--;
                }
            }
        }
        return n<=0;
    }
}