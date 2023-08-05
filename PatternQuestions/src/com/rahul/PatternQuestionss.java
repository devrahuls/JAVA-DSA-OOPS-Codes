package com.rahul;

public class PatternQuestionss {
    public static void main(String[] args) {

        Pattern1(4);
        Pattern2(4);
        Pattern3(4);
        Pattern4(5);
        Pattern5(5);
        Pattern28(5);
        Pattern30(5);
    }
    static void Pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void Pattern2(int n){
        for (int row = 0; row < n; row++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void Pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int cols = 4; cols >= row; cols--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void Pattern4(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

//    static void Pattern5(int n){
//        for (int rows = 1; rows <= n-4 ; rows++) {
//            for (int cols = 1; cols <= rows ; cols++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int rows = 6; rows <= n ; rows++) {
//            for (int cols = n; cols >= rows ; cols--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    static void Pattern5(int n){
        for (int rows = 0; rows < 2 * n; rows++) {

            int totalColsInEachRow = rows > n ? 2 * n - rows : rows;

            for (int cols = 0; cols < totalColsInEachRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void Pattern28(int n){
        for (int rows = 0; rows < 2 * n; rows++) {

            int totalColsInEachRow = rows > n ? 2 * n - rows : rows;

            int whiteSpaces = n - totalColsInEachRow;

            for (int space = 0; space < whiteSpaces; space++) {
                System.out.print(" ");
            }

            for (int cols = 0; cols < totalColsInEachRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();
    }

    static void Pattern30(int n){
        for (int row = 1; row <= n ; row++) {

            int whiteSpace = n - row;
            for (int space = 0; space < whiteSpace; space++) {
                System.out.print(" ");
            }

            for (int cols = row; cols >= 1; cols--) {
                System.out.print(cols);
            }
            for (int cols = 2; cols <= row ; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
        System.out.println();
    }
}
