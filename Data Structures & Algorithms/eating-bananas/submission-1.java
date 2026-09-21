class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int hi = 0, lo = 1;
        for (int x : piles) 
            if (x > hi) hi = x;
        int trueEater = hi;
        while (lo <= hi) { 
            int rate = lo + (hi-lo)/2;
            int time = 0;
            for (int i = 0; i < piles.length; i++) { 
                time += Math.ceil(piles[i]/(double)rate);

            }
            if (time > h)
                lo = rate + 1;
            else {
                trueEater = rate;

                hi = rate - 1;
            }

        }
        return trueEater;
        
    }
}
