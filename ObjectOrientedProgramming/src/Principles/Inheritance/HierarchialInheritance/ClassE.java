package Principles.Inheritance.HierarchialInheritance;

public class ClassE extends ClassB {

    double var5;

    ClassE(){
        var5 = -1;
    }

    ClassE(double var1, double var3, double var5){
        super(var1, var3);
        this.var5 = var5;
    }
}
