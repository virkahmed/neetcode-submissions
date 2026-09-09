class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> seen = new HashMap<>();

        for (int x : nums) { 
            if (seen.get(x) != null) { 
                return true;
            }
            seen.put(x, true);

        }
        return false;
    }
}