class Solution {
    // [0,6,2,1,0,0]
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int champ = 0;
        int champP = 0;
        for (int i = prices.length - 1; i >=0; i--) { 
            int profit = champP - prices[i];
            dp[i] = profit;
            if (champ < profit) { 
                champ = profit;
            }
            if (prices[i] > champP) { 
                champP = prices[i];
            }

        }
        return champ;
    }
}
