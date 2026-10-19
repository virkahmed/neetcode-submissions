class Solution {
    // 76 1 3 5
    private Integer[] memo;
    public int rob(int[] nums) {
        memo = new Integer[nums.length];
        return aux(nums, 0);
        
    }
    private int aux(int[] nums, int i ) { 
        if (memo[i]!=null) {
            return memo[i];
        }
        
        if (i == nums.length-1) {
            memo[i] = nums[i]; 
            return nums[i];
        }
        if (i == nums.length-2) { 
            memo[i] = Math.max(nums[i], nums[i+1]);
            return memo[i];
        }    
        memo[i]=  Math.max(nums[i] + aux(nums, i+2), aux(nums,i+1));
        return memo[i];
    }
}
