class Solution {
    // s1 = "abdcc" s2 = "laksdjfcdcba"
    // keys = {a:1, b:1, d:1, c:2}
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> keys = new HashMap<>();
        if (s1.length() > s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) { 
            char key = s1.charAt(i);
            if (keys.get(key) == null) { 
                keys.put(key, 1);
            }
            else { 

                keys.put(key, keys.get(key)+1);
            }

        }
        int l = 0;
        int r = s1.length()-1;
        HashMap<Character, Integer> compare = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) { 
            char key = s2.charAt(i);
            if (compare.get(key) == null) { 
                compare.put(key, 1);
            }
            else { 
                compare.put(key, compare.get(key)+1);
            }

        }
        while (r < s2.length()) { 
            if (compare.equals(keys))
                return true;
            compare.put(s2.charAt(l), compare.get(s2.charAt(l))-1);
            if (compare.get(s2.charAt(l))==0) {
                compare.remove(s2.charAt(l));
            }
            l++;
            r++;
            if (r >= s2.length())
                break;
            if (compare.get(s2.charAt(r)) == null) { 
                compare.put(s2.charAt(r), 1);
            }
            else {
                compare.put(s2.charAt(r), compare.get(s2.charAt(r))+1);
            }
            

        }
        return false;

    }
}
