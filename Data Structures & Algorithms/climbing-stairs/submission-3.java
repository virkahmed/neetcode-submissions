class Solution {
    private int[] memo;


    public int climbStairs(int n) {
        memo = new int[n+1];
        return aux(n);
    }

    private int aux(int n) { 
        if (n <=2)
            return n;
        if (memo[n] != 0) { 
            return memo[n];
        }
        memo[n] = aux(n-1) + aux(n-2);
        return memo[n];

    }


}
