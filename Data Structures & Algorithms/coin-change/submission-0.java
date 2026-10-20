class Solution {
    // [1, 5, 10]  0 = 0     i = 1  minimize(tab[i], tab[i-c]+1)
    // amount = 25 minimize(tab[i-1] + 1, tab[])
    //  tab = [0,....,0] length = amount +1

    public int coinChange(int[] coins, int amount) {
        int[] tab = new int[amount+1];

        for (int i =1; i <=amount; i++) { 
            tab[i] = amount+1;
            for (int coin : coins) { 
                if (coin <= i ) { 
                    tab[i] = Math.min(tab[i], tab[i-coin] + 1);

                }

            }


        }
        if (tab[amount] == amount+1)
            return -1;
        return tab[amount];
    }
}
