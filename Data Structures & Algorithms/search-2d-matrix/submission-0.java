class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0, hi = matrix.length*matrix[0].length - 1; 

        while (lo <= hi) { 
            int mid = lo + (hi-lo)/2;
            int[] coords = coord(matrix[0].length, mid);
            int i = coords[0], j = coords[1];
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] < target ) { 
                lo = mid + 1;
            }
            else { 
                hi = mid-1;
            }
            

        }
        return false;
    }
    private int[] coord(int m, int num) { 
        int i = num / m;
        int j = num % m;
        return new int[]{i,j};
    } 
}
