package Interfaces.extendDemo;

public class Main implements B{

    //We have to implement both methods, greet() i.e., a method inside B & fun() i.e., extended by B, and here we are implementing Interface 'B',
    // so we have to implement all the methods that are available in B & A.
    @Override
    public void fun() {

    }

    //In every Overridden methods the access modifier of the method can't be the less restrictive, in compare to the original one(where the method originally created).
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.funcc();
    }
}
