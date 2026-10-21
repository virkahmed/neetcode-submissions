class Solution {
    private int[] status;
    private ArrayList<ArrayList<Integer>> adjacent;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        status = new int[numCourses];

        adjacent = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < numCourses; i++) { 
            adjacent.add(i, new ArrayList<Integer>());

        }
        // [[0,1],[1,2], [3,1]]
        for (int[] pair : prerequisites ) {  
            adjacent.get(pair[0]).add(pair[1]);

        }

        for (int i = 0; i < numCourses; i++) { 
            if (cycle(i))
                return false;
            

        }
        return true;
    }
    private boolean cycle(int i) { 
        if (status[i] == 1) { 
            return true;
        }
        if (status[i] == 2) { 
            return false;
        }
        status[i] = 1;
        ArrayList<Integer> neighbors = adjacent.get(i);

        for (int x : neighbors) {
            if (cycle(x))
                return true;
        }
        status[i] = 2;

        return false;

    }
}
