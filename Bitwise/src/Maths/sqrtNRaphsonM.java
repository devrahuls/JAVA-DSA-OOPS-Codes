package Maths;

public class sqrtNRaphsonM {
    public static void main(String[] args) {

        int n = 40;
        System.out.println(sqrt(n));
    }

    static double sqrt(int n){
        double x = n;
        double root;

        while (true){
            root = 0.5 * (x + n / x); //Newton Raphson formula for finding root of an integer number.

            if(Math.abs(root - x) < 0.5){  //error
                break;  //if the error is less than 0.5 then break this loop
            }

            x = root;
        }

        return root;
    }
}
