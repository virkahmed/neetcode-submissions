class Solution {

    // ababd  abbc
    public String longestPalindrome(String s) {
        if (s.length() == 1) 
            return s;
        int champLen = 1;
        int champIndex = 0;
            for (int i = 0; i < s.length(); i++) {
                int l = i;
                int r = i;
                while (l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)) { 
                    if (r-l+1 > champLen) {
                        champIndex = l;
                        champLen = r-l+1;

                    }
                    l--;
                    r++;


                }
            }



        
            
            for (int i = 0; i < s.length()-1; i++) {
                int l = i;
                int r = i+1;
                while (l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)) { 
                    if (r-l+1 > champLen) {
                        champIndex = l;
                        champLen = r-l+1;

                    }
                    l--;
                    r++;
                }
            }


        

        return s.substring(champIndex, champIndex+champLen);
       
    }
}
