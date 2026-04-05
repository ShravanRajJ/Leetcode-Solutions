// Problem: Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Approach: Track minimum price so far and calculate max profit
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxpro = 0;

        for(int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            maxpro = Math.max(maxpro, prices[i] - min);
        }

        return maxpro;
    }
}
