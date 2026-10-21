class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;
    // 1 2 3 4 5 
    // k = 2.   1 2
    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        this.k = k;

        for (int i = 0; i < nums.length; i++) { 
            add(nums[i]);

        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() <= k) { 
            return minHeap.peek();

        }
        else {

            minHeap.poll();
            return minHeap.peek();
        }

    }
}
