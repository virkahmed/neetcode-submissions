class Solution {
    // 2 3 6 2 4         2 2 1     
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) { 
            maxHeap.add(stone);

        } 
        
        while (maxHeap.size() > 1) { 
            int s1 = maxHeap.poll(); // 3          
            int s2 = maxHeap.poll();  // 2

            if (s1 > s2) { 
                int remainder = s1 - s2;  // 1
                maxHeap.add(remainder);
            }
            if (s2 > s1) {
                int remainder = s2 - s1;
                maxHeap.add(remainder);
            } 
        }
        if (maxHeap.size() == 0) { 
            return 0;
        }
        return maxHeap.peek();
    }
}
