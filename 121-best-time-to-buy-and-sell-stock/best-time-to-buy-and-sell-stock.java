class Solution {
    public int maxProfit(int[] prices) {
     int cost=0,pro=0,min=prices[0];
     for(int i=1;i<prices.length;i++)
     {
        cost=prices[i]-min;
        if(cost>pro)
        {
            pro=cost;
        }
        if(prices[i]<min)
        {
            min=prices[i];
        }
     } 
     return pro;  
    }
}