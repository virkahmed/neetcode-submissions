class Solution {
    private Integer[] memo;
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        memo = new Integer[nums.length];
        int l = aux(Arrays.copyOfRange(nums, 1, nums.length),0);
        memo = new Integer[nums.length];
        int r = aux(Arrays.copyOfRange(nums, 0, nums.length-1),0);
        return Math.max(l,r);
    }

    private int aux(int[] nums, int i){
        if (memo[i] != null) 
            return memo[i];
        if (i == nums.length-1) { 
            memo[i] = nums[i];
            return memo[i];
        }
        if (i == nums.length-2) { 
            memo[i] = Math.max(aux(nums,i+1), nums[i]);
            return memo[i];
        }
            
        
        memo[i] = Math.max(aux(nums, i+1), nums[i] + aux(nums, i+2));
        return memo[i];
    }
}
