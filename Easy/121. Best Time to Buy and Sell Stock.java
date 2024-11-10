class Solution {
    public int maxProfit(int[] prices) {
        // Pointer for current day
        int presentPointer = 0;
        // Pointer for pointing to future selling day
        int futurePointer = 1;
        // tracker for most profit transcation
        int mostProfit = 0;
        // Keep track of min. pay for entire array
        int minPay = 1000000;

        for (int i = 0; i < prices.length; i++) {
            // Ensure we are using least amount currently for calucation
            if (prices[i] < minPay) {
                minPay = prices[i];
            }
            // Find out the largest margin
            int margin = prices[i] - minPay;
            if (margin > mostProfit) {
                mostProfit = margin;
            }
        }

        return mostProfit;
    }
}
