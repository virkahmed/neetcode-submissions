class Solution {
    private Integer[] memo;


    public int numDecodings(String s) {
        memo = new Integer[s.length() + 1];
        return aux(s, 0);
    }
    private int aux(String s, int i ) { 
    if (s.length() == i) {
            return 1;
        }
if (s.charAt(i) == '0') {
            return 0;
        }
        
        if (memo[i] != null) return memo[i];
        int ways = aux(s, i+1);
        if (i+1 < s.length()) { 
            int two = Integer.parseInt(s.substring(i, i+2));
            if (two <= 26) ways += aux(s,i+2);
        }
        return memo[i] = ways;

        
    }
}
