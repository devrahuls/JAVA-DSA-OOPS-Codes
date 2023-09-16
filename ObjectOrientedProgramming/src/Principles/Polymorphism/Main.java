package Principles.Polymorphism;

public class Main {
    public static void main(String[] args) {

        //This is method overriding. aka Second type of Polymorphism that is 'Runtime/ Dynamic Polymorphism'
        Shapes shapes = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        Shapes triangle = new Triangle();


        //These all access their respective area() method
        shapes.area();
        circle.area();
        square.area();
        triangle.area();

        System.out.println(Main(2, 3));
        System.out.println(Main(2, 3, 4));
    }

    //This is method overloading. aka First type of Polymorphism i.e., 'Compile time/ Static Polymorphism'
    static int Main(int a, int b){
        return a + b;
    }
    static double Main(int a, int b, int c){
        return a + b + c;
    }



}
