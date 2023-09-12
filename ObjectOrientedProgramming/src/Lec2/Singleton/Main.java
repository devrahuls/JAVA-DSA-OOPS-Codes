package Lec2.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        //All these 3 ref. variables (obj1, obj2, obj3) are pointing to the same object.
    }
}
