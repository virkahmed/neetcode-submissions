class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int champ = 0;
        while (r < prices.length) { 
            if (prices[l] > prices[r]) { 
                l = r;
                r++;
            }
            else { 
                if (champ < prices[r] - prices[l])
                    champ = prices[r] - prices[l];
                r++;
            }
        }
        return champ;
    }
}
