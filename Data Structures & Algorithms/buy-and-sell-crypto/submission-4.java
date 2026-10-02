class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE, profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min, prices[i]);
            profit=Math.max(profit, prices[i]-min);
        }
        return profit;
    }
}
