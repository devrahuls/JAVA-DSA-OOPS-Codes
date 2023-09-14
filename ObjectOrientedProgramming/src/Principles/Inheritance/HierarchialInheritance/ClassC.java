package Principles.Inheritance.HierarchialInheritance;

//this is a child class of A
public class ClassC extends ClassA{
    double var3;

    ClassC(){
        var3 = -1;
    }

    ClassC(double var1, double var3){
        super(var1);
        this.var3 = var3;
    }
}
