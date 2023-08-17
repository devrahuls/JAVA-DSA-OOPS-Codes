package Backtracking;

//This is the maze problem with no restrictions
public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        allPath("", maze, 0,0 );
    }

    //This fn returns all the possible path to reach from (0,0) to (3,3) without any restrictions.
    //Here, D - Down, U - Up, R - Right, L - Left
    static void allPath(String p, boolean[][] maze, int r, int c){
        if ( r == maze.length - 1 && c == maze[0].length - 1){
            System.out.print(p + " ");
            return;
        }

        if (!maze[r][c]){
            return;
        }

//        I am considering this block in my path, for a particular function call.
        maze[r][c] = false;

        if(r < maze.length - 1){
            allPath(p + "D", maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            allPath(p + "R", maze, r, c + 1);
        }
        if (r > 0){
            allPath(p + "U", maze, r - 1, c);
        }
        if (c > 0){
            allPath(p + "L", maze, r, c - 1);
        }

//        This line is where the fn call will over
//        So when the fn gets removed from the stack, it also removes all tha changes that have been made for that particularly fn call.
        maze[r][c] = true;

    }
}
