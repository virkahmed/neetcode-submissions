class Solution {
    // 1, 8, 7, 3, 6, 3, 10
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> store = new Stack<>();
        store.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            while (!store.isEmpty() && temperatures[store.peek()] < temperatures[i]) { 
                int prevIndex = store.pop();
                result[prevIndex] = i - prevIndex;
            }
            store.push(i);
        }
        while (!store.isEmpty()){ 
            result[store.pop()] = 0;
        }
        return result;
    }
}