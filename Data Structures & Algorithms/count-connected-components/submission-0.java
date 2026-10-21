class Solution {
    private ArrayList<ArrayList<Integer>> adjacent;
    private int[] status; 


    public int countComponents(int n, int[][] edges) {
        if (n == 0)
            return 0;
        if (edges.length == 0) 
            return n;
        int sum = 0;

        adjacent = new ArrayList<ArrayList<Integer>>();
        status = new int[n];
        

        for (int i = 0; i < n; i++) { 
            adjacent.add(i, new ArrayList<>());

        }

        for (int[] edge: edges) { 
            adjacent.get(edge[0]).add(edge[1]);
            adjacent.get(edge[1]).add(edge[0]);

        }

        dfs(0);
        sum++;

        for (int i = 0; i < status.length; i++) { 
            if (status[i] == 0 ) { 
                dfs(i);
                sum++;

            }

        }

        return sum;

        
    }

    
    private void dfs(int n) { 
        if (status[n] == 1) {
            return;
        }
        status[n] = 1;
        
        ArrayList<Integer> neighbors = adjacent.get(n);

        for (int neighbor: neighbors) { 
            dfs(neighbor);

        }
        return;

    }

    
}
