package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(mazeCount(3, 3));
        mazePath("", 3, 3);
        System.out.println();
        System.out.print(mazePathRet("", 3, 3));
        System.out.println();
        System.out.println(mazePathRetDiagonal("",3, 3));

        boolean[][] maze = {
                {true, true, true},
            {true, false, true},
            {true, true, true},
        };
        mazePathWithRestrictions("", maze, 0, 0);
    }

    //Returns how many the number of counts or ways to reach from (0,0) to (3,3), if we go only Down and Right.
    static int mazeCount(int r, int c){

        //Row = 1 means we have reached very bottom, Col = 1 means we have reached very right.
        if (r == 1 || c == 1){
            return 1;
        }


        int left = mazeCount(r-1, c);
        int right = mazeCount(r, c - 1);

        return left + right;
    }

//    Returns the actual path to react from (0, 0) to (3, 3), if we move only Down and Right.
    static void mazePath(String p, int r, int c){

        if ( r== 1 && c == 1){
            System.out.print(p + " ");
            return;
        }

        if (r > 1){
            mazePath(p + "D", r - 1, c);
        }
        if (c > 1){
            mazePath(p + "R", r, c - 1);
        }
    }


    // Return the same thing above but just as an ArrayList
    static ArrayList<String> mazePathRet(String p, int r, int c){

        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(mazePathRet(p + "D", r-1, c));
        }
        if(c > 1){
            list.addAll(mazePathRet(p + "R", r, c-1));
        }

        return list;
    }

    static ArrayList<String> mazePathRetDiagonal(String p, int r, int c){

        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(mazePathRet(p + "D", r-1, c));
        }
        if (r > 1 && c > 1){
            list.addAll(mazePathRet(p + "X", r - 1, c - 1));
        }
        if(c > 1){
            list.addAll(mazePathRet(p + "R", r, c-1));
        }


        return list;
    }


    static void mazePathWithRestrictions(String p, boolean[][] mazeR, int r, int c){

        if ( r == mazeR.length - 1 && c == mazeR[0].length - 1){
            System.out.print(p + " ");
            return;
        }

        if (!mazeR[r][c]){
            return;
        }

        if (r < mazeR.length - 1){
            mazePathWithRestrictions(p + "D",mazeR, r + 1, c);
        }
        if (c < mazeR[0].length - 1){
            mazePathWithRestrictions(p + "R", mazeR, r, c + 1);
        }
    }


}
