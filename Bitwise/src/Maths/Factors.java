package Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factor2(20);
    }

    // O(n) complexity
    static void factor1(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    // O( sqrt(n) )
    static void factor2(int n){

        ArrayList<Integer> list = new ArrayList<>();

        //to find the factors
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }

        //to arrange the factors in a suitable order.
        for (int i = list.size() -1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
