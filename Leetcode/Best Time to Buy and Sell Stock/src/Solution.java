class Solution {
    static public int maxProfit(int[] prices) {
        int winner = 0;
        int smallestSoFar = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < smallestSoFar) {
                smallestSoFar = prices[i];
                continue;
            }
            int diff = prices[i] - smallestSoFar;
            if (diff > winner) {
                winner = diff;
            }
        }
        return winner;
    }
}