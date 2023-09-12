package Lec2.StaticExample;

public class StaticBlock {

    static int a = 10;
    static int b;

    //It will only run once, when the object is created i.e., when the class is loaded for the very first time.
    static {
        System.out.println("I am in Static block bitch!");
        b = 20;
    }


    public static void main(String[] args) {


        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.b);
    }
}
