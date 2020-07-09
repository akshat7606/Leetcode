class maxAreaOfIsland {
    public static int findMax(int[][] grid){
        if(grid==null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int count = 0;

        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                count = Math.max(count , dfs(grid, i, j));
            }
        }
        return count;
    }
   
    public static int dfs(int[][] grid, int r, int c) {
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==0){
            return 0;
        }
        
        grid[r][c] = 0;
        return 1+dfs(grid, r+1, c)+dfs(grid, r-1, c)+dfs(grid, r, c-1)+dfs(grid, r, c+1);
        
    }
    public static void main(String[] args) {
        int[][] grid = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        System.out.println(maxAreaOfIsland.findMax(grid));
    }
}