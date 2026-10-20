class Solution {
    public int countSubstrings(String s) {
     if (s.length() == 1) 
            return 1;
        int nums = 0;
            for (int i = 0; i < s.length(); i++) {
                int l = i;
                int r = i;
                while (l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)) { 
                    nums++;
                    l--;
                    r++;


                }
            }

            
            for (int i = 0; i < s.length()-1; i++) {
                int l = i;
                int r = i+1;
                while (l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)) { 
                    nums++;
                    l--;
                    r++;
                }
            }
        return nums;
          
    }
}
