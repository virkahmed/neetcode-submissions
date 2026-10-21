class Solution {
    private List<List<Integer>> result;
    private int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        this.nums = nums;

        aux(0, new ArrayList<Integer>());
        return result;
    }

    private void aux(int index, List<Integer> subset) { 
        List<Integer> subsetC = new ArrayList<>(subset);
        subsetC.add(nums[index]);

        if (index == nums.length-1) { 
            result.add(subset);
            
            result.add(subsetC);
            return;

        }

        aux(index+1, subsetC);
        aux(index+1, subset);
        return;

    }
}
