class Solution {
    private int[] status;
    private ArrayList<ArrayList<Integer>> adjacent;

    public boolean validTree(int n, int[][] edges) {
        status = new int[n];
        adjacent = new ArrayList<>();

        for (int i = 0; i < n; i++){ 
            adjacent.add(i, new ArrayList<>());

        }
        for (int[] pair : edges) { 
            adjacent.get(pair[0]).add(pair[1]);
            adjacent.get(pair[1]).add(pair[0]);

        }

        boolean nonCyclic = valid(0, -1);
        boolean fc = true;
        for (int i = 0; i < status.length; i++) { 
            if (status[i] == 0)
                fc = false;
        }

        return nonCyclic && fc;

    }

    private boolean valid(int node, int parent) { 
        if (status[node] == 1)
            return false;
        status[node] = 1;

        ArrayList<Integer> neighbors = adjacent.get(node);

        for (int adj : neighbors) { 
            if (adj != parent) { 
                if(!valid(adj, node))
                    return false;

            }

        }
        return true;

    }
    
}
