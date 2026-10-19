class Solution {
    public int rob(int[] nums) {
        int[] tab = new int[nums.length];
        int champ = 0;
        for (int i = 0; i < nums.length; i++) { 
        if (i <= 1) {
            if (i == 0)
                tab[i] = nums[i];
            if (i == 1)
                tab[i] = Math.max(nums[i], nums[i-1]);
        }   
        else { 
            tab[i] = Math.max(nums[i] + tab[i-2], tab[i-1]);
        }
        if (tab[i] > champ)
            champ = tab[i];

        } 

        return champ;
    }
}
