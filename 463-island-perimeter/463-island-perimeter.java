class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length, m = grid[0].length, perim = 0;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    int sides = 4;
                    if(j != 0 && grid[i][j-1] == 1) sides--;
                    if(j != m-1 && grid[i][j+1] == 1) sides--;
                    if(i != 0 && grid[i-1][j] == 1) sides--;
                    if(i != n-1 && grid[i+1][j] == 1) sides--;
                    perim += sides;
                }
            }
        }
        
        return perim;
    }
}