package Interfaces.extendDemo;

public interface A {

//    static void funcc();//Cant be like this
    //Static interfaces methods should always have a body.
    //Call via the interface name.
    static void funcc(){
        System.out.println("I am in static interface");
    }
    public void fun();
}
