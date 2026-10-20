class Solution {
    // -1, -2, -3, 0, 1, 2, 3
    public int maxProduct(int[] nums) {
        int curMax = nums[0];
        int curMin = nums[0];
        if (nums[0] == 0) {
            curMax = 1;
            curMin = 1;
        }
        int champ = nums[0];
        
        for (int i = 1; i < nums.length; i++) { 
            int x = nums[i];
            if (x == 0) { 
                
                curMax = 1;
                curMin = 1;
                if (x > champ) {
                    champ = x;
                    
                }
            }
            if (x > 0) { 
                curMax = Math.max(x, curMax*x);
                curMin = Math.min(x, curMin*x);
                if (curMax > champ)
                    champ = curMax;
            }
            if (x < 0 ) { 
                int temp = curMax * x; // -6 max = 2, min = -2;
                curMax = Math.max(x, x*curMin);
                curMin = Math.min(x, temp); //  max = 2 min = -2
                if (curMax > champ)
                    champ = curMax;
                

            }
            
            
        }
        return champ;
    }
}
