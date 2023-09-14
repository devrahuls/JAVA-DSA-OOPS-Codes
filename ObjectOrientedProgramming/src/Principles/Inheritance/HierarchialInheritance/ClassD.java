package Principles.Inheritance.HierarchialInheritance;

public class ClassD extends ClassB{

    double var4;

    ClassD(){
        var4 = -1;
    }

    ClassD(double var1, double var2, double var4){
        super(var1, var2);
        this.var4 = var4;
    }


}
