package Patterns;

public class Pattern {
    public static void main(String[] args) {
        Pattern0(4, 0);
        InversePattern0(4, 0);
    }

    static void Pattern0(int r, int c){
        if (r == 0){
            return;
        }

        if (r > c){
            System.out.print("* ");
            Pattern0(r, c + 1);
        }else {
            System.out.println();
            Pattern0(r - 1, 0);
        }
    }

    static void InversePattern0(int r, int c){
        if (r == 0){
            return;
        }

        if (r > c){
            InversePattern0(r, c + 1);
            System.out.print("* ");
        }else {
            InversePattern0(r - 1, 0);
            System.out.println();
        }
    }
}
