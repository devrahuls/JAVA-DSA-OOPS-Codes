package Principles.Polymorphism;

public class Circle extends Shapes{

    //This will run when the object of Circle is created.
    //Hence, it is overriding the parent method.
    @Override //This is called annotation. It checks whether the child class has the same name, arguments, and return type's method as same as it parent class has, or not.
    //showing error if it is not same.
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
