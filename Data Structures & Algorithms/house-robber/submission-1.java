class Solution {
    // 76 1 3 5
    private int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        return aux(nums, 0);
        
    }
    private int aux(int[] nums, int i ) { 
        if (memo[i]!=0) {
            return memo[i];
        }
        if (i >= nums.length-2) { 
            if (i == nums.length-1) {
                memo[i] = nums[i]; 
                return nums[i];
            }
            if (i == nums.length-2) { 
                memo[i] = Math.max(nums[i], nums[i+1]);
                return memo[i];
            }

        }
        memo[i]=  Math.max(nums[i] + aux(nums, i+2), aux(nums,i+1));
        return memo[i];
    }
}
