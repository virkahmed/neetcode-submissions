class Solution {
    // AAABABBBBB k = 2
    // AAABAB
    //
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int n = s.length();
        int champLen = 1;
        char champChar = s.charAt(0);
        map.put(champChar, 0);
        int others = 0;

        while (r < n) { 
            if (s.charAt(r) == champChar) {
                
                map.put(champChar, map.get(champChar)+1);
            }
            else { 
                if (map.get(s.charAt(r)) == null) { 
                    map.put(s.charAt(r), 1);
                }
                else { 
                    map.put(s.charAt(r), 1+map.get(s.charAt(r)));
                }
                if (map.get(s.charAt(r)) > map.get(champChar)) { 
                    others = map.get(champChar);
                    champChar = s.charAt(r);

                }
                else { 
                    others++;

                }
            }
            while (r-l+1 - map.get(champChar) > k) { 
                char gone = s.charAt(l);
                map.put(gone, map.get(gone)-1);
                l++;
                if (gone == champChar) { 
                    for (char key : map.keySet()) { 
                        if (map.get(key) > map.get(champChar))
                            champChar = key;
                    }
                }
            }
            champLen = Math.max(r-l+1, champLen);
            r++;    

        }
        return champLen;

    }
}
