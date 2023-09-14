package Principles.Inheritance.HierarchialInheritance;

//this is a child class of A
public class ClassB extends ClassA{

    double var2;

    ClassB(){
        var2 = -1;
    }

    ClassB(double var1, double var2){
        super(var1);
        this.var2 = var2;
    }
}
