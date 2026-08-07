class Solution {
    public int maxProfit(int[] prices) {
        int r=1, l=0, profit=0;
        while(r<prices.length)
        {
            if(prices[l]<prices[r])
            {
                profit=Math.max(profit, prices[r]-prices[l]);
            }
            else
            l=r;

            r++;
        }
        return profit;
    }
}
