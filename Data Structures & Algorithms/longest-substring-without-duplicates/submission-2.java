class Solution {
    // zxyzxyz
    // pl = 0; pr = 1
    //
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len <= 1)
            return len;
        
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> seen = new HashMap<>(); 
        int champ = 1;
        while (r < len) { 
            if (seen.get(s.charAt(r)) == null) { 
                seen.put(s.charAt(r), r);
                

            }
            else { 
                int goTo = seen.get(s.charAt(r));
                if (goTo >= l)
                    l = goTo+1;
                seen.put(s.charAt(r), r);

            }
            champ = Math.max(champ, r-l+1);


            r++;
        }
        return champ;

        
    }
}
