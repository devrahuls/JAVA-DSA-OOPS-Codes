package Backtracking;

import java.util.Arrays;

public class AllPathswithDirection {
    public static void main(String[] args) {
        //For the actual path
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        //For the path that were taking and count its.
        int[][] path = new int[board.length][board[0].length];

        allPathPrints("", board, 0, 0, path, 1);
    }

    //Its prints the actual path from that the recursion is going to reach the destination.
    static void allPathPrints(String p, boolean[][] maze, int r, int c, int[][] path, int step){

        if ( r == maze.length - 1 && c == maze[0].length - 1){

            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        //If the cell is already false then return backs from the fn call.
        if (!maze[r][c]){
            return;
        }

//        I am considering this block in my path, for a particular function call.
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1){
            allPathPrints(p + "D", maze, r + 1, c, path, step + 1);
        }
        if(c < maze[0].length - 1){
            allPathPrints(p + "R", maze, r, c + 1, path, step + 1);
        }
        if (r > 0){
            allPathPrints(p + "U", maze, r - 1, c, path, step + 1);
        }
        if (c > 0){
            allPathPrints(p + "L", maze, r, c - 1, path, step + 1);
        }

//        This line is where the fn call will over
//        So when the fn gets removed from the stack, it also removes all tha changes that were being made for that particularly fn call.
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
