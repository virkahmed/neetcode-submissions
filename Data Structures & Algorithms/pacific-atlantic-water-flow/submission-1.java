class Solution {
    private boolean[][] atlanticMask;
    private boolean[][] pacificMask;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        atlanticMask = new boolean[heights.length][heights[0].length];
        pacificMask = new boolean[heights.length][heights[0].length];
        
        // left edge
        for(int i = 0; i < heights.length; i++) { 
            dfs(heights, i, 0, heights[i][0], pacificMask );

        }
        // top edge
        for(int i = 0; i < heights[0].length; i++) { 
            dfs(heights, 0, i, heights[0][i], pacificMask );

        }
        // right
        for(int i = 0; i < heights.length; i++) { 
            dfs(heights, i, heights[0].length-1, heights[i][heights[0].length-1], atlanticMask );

        }
        // bot
        for(int i = 0; i < heights[0].length; i++) { 
            dfs(heights, heights.length-1, i, heights[heights.length-1][i], atlanticMask );

        }
        for (int i = 0; i < heights.length; i++) { 
            for (int j = 0; j < heights[0].length; j++) { 
                if (pacificMask[i][j] && atlanticMask[i][j]) { 
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    res.add(pair);
                }
            }
            
        }
        return res;
    }

    private void dfs(int[][] heights, int r, int c, int prev, boolean[][] mask) { 
        if (r < 0 || c < 0 || r >= heights.length || c >= heights[0].length) { 
            return;
        }
        if (mask[r][c] == true)
            return;
        
        int curr = heights[r][c];
        if (curr < prev)
            return;
        mask[r][c] = true;

        dfs(heights, r+1, c, curr, mask);
        dfs(heights, r-1, c, curr, mask);
        dfs(heights, r, c+1, curr, mask);
        dfs(heights, r, c-1, curr, mask);


    }
}
