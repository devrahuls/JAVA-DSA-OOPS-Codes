//This file is Related to the package name Access (i.e., the concept of Encapsulation).
package AccessModifierTesting;

import Access.A;

public class Subclass extends A {

    public Subclass(int num, String name){
        super(num , name);
    }

    public static void main(String[] args) {
        //Protected modifier can be also accessed by a Subclass of a different package.
        Subclass obj = new Subclass(10, "JkJkj");
        int n = obj.num;

        //This won't work, because 'num' variable is protected and can only be accessable by via ChildClass or the class has to be in the same package.
//        A obj = new A(10, "JkJkj");
//        int n = obj.num;
    }
}

class SubSubClass extends Subclass{
    public SubSubClass(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj3 = new SubSubClass(40, "dsfib");
        int n = obj3.num;
    }
}

class SubClass2 extends A{

    public SubClass2(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj2 = new SubClass2(60, "yfgre");
        int n = obj2.num;
    }
}
