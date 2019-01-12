package main.java.leetcode.Dec18_2018;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int numberOfSide =0;
        for(int i =0; i<grid.length; i++){
            for (int j =0; j<grid[0].length;j++){
                if( grid[i][j]==1 ) {
                    if( j==0 || grid[i][j-1]==0 ) numberOfSide++;
                    if( j==grid[i].length-1 || grid[i][j+1]==0 ) numberOfSide++;
                    if( i==0 || grid[i-1][j]==0 ) numberOfSide++;
                    if( i==grid.length-1 || grid[i+1][j]==0 ) numberOfSide++;

                }
            }
        }
        return numberOfSide;


    }
    public static void main(String[] args){
        IslandPerimeter ip = new IslandPerimeter();
        int[][] grid =
                {{0,1,0,0}, {1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int perimeter = ip.islandPerimeter(grid);
        System.out.print(perimeter);
    }
}
