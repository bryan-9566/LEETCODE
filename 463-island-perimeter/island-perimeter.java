class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter=4,edge=2;
        int land=0,shared=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    land++;
                    if(i+1<grid.length && grid[i+1][j]==1)
                {
                    shared++;
                }
                if(j+1<grid[i].length && grid[i][j+1]==1)
                {
                    shared++;
                }
                }
            }
        }
        return (perimeter*land)-(edge*shared);
    }
}