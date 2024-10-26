class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int sell = prices[prices.length - 1];
        int buy = 0;
        
        for (int i = prices.length - 1; i >= 0; i--) {
            buy = prices[i];
            if (buy > sell) {
                sell = buy;
            } else if (profit < sell - buy) {
                profit = sell - buy;
            }
        }
        return profit;

    }
}