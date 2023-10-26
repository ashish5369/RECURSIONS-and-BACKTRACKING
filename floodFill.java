import java.util.*;

public class floodFill {
    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited) {
        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1) {
            return;
        }
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }
        visited[row][col] = true;
        floodfill(maze, row - 1, col, psf + "t", visited);// this when we can move upwards
        floodfill(maze, row, col - 1, psf + "l", visited);// this when we can move left

        floodfill(maze, row + 1, col, psf + "d", visited);// this when we can move downwards

        floodfill(maze, row, col + 1, psf + "r", visited);// this when we can move right
        // after rturning from recursion we are going tomake sure that w4e make the path
        // false so that when we want ot have a diferent path we are able to go to that
        // path
        visited[row][col] = false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m]; // this array is to make sure that we are not going back to the same
                                                 // box that we have already gone
        floodfill(arr, 0, 0, "", visited);
        sc.close();
    }
}
