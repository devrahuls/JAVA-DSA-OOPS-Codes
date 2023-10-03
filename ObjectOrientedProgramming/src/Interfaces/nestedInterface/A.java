package Interfaces.nestedInterface;

public class A {

    //Nested Interface
    public interface NestedInterface{
        boolean isEven(int num);
    }
}

class B implements A.NestedInterface{


    @Override
    public boolean isEven(int num) {
        return (num % 2) == 0;
    }
}
