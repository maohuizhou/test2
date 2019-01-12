package main.java.leetcode.Dec26_2018;

public class MyProgram {
    public static void main(String[] args) {
        //Create the char[][] grid:
        String map = "##....###!#...###..!#.#..#..s!####.#...!##...###.";
        String[] lines = map.split("!");
        char[][] grid = new char[lines.length][lines[0].length()];
        for (int j=0;j<grid.length;j++) {
            for (int i = 0; i < grid[j].length; i++) {
                grid[j][i] = lines[j].charAt(i);
                System.out.print(grid[j][i]);
            }
            System.out.println(" ");
        }
        System.out.println("======================== ");
        //Run floodCount on the grid given a start position and an empty visited array
        int count = floodCount(grid, new boolean[grid.length][grid[0].length], 2, 8); //row 2, 8 is where the 's' is

        //Print the resulting grid which hasn't changed:
        for (int j=0;j<grid.length;j++) {
            for (int i=0;i<grid[j].length;i++) System.out.print(grid[j][i]);
            System.out.println();
        }

        //Print the sum count
        System.out.println(count);
    }

    //floodCount algorithm:
    static int floodCount(char[][] grid, boolean[][] visited, int r, int c) {
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return 0;
        if(visited[r][c]) return 0;
        visited[r][c] = true;
        if(grid[r][c]=='#') return 0;
        int out = 0;
        if(grid[r][c]=='.') out++;
        out += floodCount(grid,visited,r+1,c);
        out += floodCount(grid,visited,r-1,c);
        out += floodCount(grid,visited,r,c+1);
        out += floodCount(grid,visited,r,c-1);
        return out;
    }
}
