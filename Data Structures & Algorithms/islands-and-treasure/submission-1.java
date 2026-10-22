class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < grid.length; i++) { 
            for (int j = 0; j< grid[0].length; j++) { 
                if (grid[i][j] == 0){
                    int[] pair = new int[2];
                    pair[0] = i;
                    pair[1] = j;
                    q.add(pair);
                }

            }

        }
        int[] stop = new int[2];
        stop[0] = -2;
        stop[1] = -2;
        q.add(stop);
        int dist = 0;
        while (q.size() > 1) { 
            int[] coords = q.remove();
            int r = coords[0];
            int c = coords[1];
            if (r == -2) {
                dist++;
                q.add(coords);
            }
            else {
                if (!(r < 0 || r > grid.length-1 || c < 0 || c > grid[0].length-1)) { 
                    if (!(grid[r][c] == -1 || (dist != 0 && dist >= grid[r][c]))){
                        int[] up = {r-1, c};
                        int[] down = {r+1, c};
                        int[] left = {r, c+1};
                        int[] right = {r, c-1};
                        grid[r][c] = dist;
                        q.add(up);
                        q.add(down);
                        q.add(left);
                        q.add(right);
                    }


                }
                
            }


        }

    }
}
