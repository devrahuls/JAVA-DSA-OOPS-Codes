package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 2);
        }

        //forEach uses a Lambda function and stores a Consumer<>.
        list.forEach((item) -> System.out.print(item * 3 + " "));
        System.out.println();
        //this is how we can also write the above line.
        Consumer<Integer> fun = (item) -> System.out.print(item * 4 + " ");
        list.forEach(fun);
        System.out.println();


        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;

        LambdaFunction myCalc = new LambdaFunction();
        System.out.println(myCalc.operate(5, 3, sum));
        System.out.println(myCalc.operate(5, 3, sub));
        System.out.println(myCalc.operate(5, 3, prod));


    }

    int sum(int a, int b){
        return a + b;
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}

interface Operation{
    int operation(int a, int b);
}
