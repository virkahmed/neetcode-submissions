class Solution {
    // 76 1 3 5
    private Integer[] memo;
    private int[] nums;
    public int rob(int[] nums) {
        this.nums = nums;
        memo = new Integer[nums.length];
        return aux(0);
        
    }
    private int aux(int i ) { 
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
        memo[i]=  Math.max(nums[i] + aux(i+2), aux(i+1));
        return memo[i];
    }
}
