package Principles.Inheritance.HierarchialInheritance;

public class Main {

    ClassE classE = new ClassE(30, 40, 50);//Here we can access ClassE(child of classC), ClassC(child of ClassA), and also ClassA.
    ClassD classD = new ClassD(60, 70, 80); //Here we can access ClassD(child of classB), ClassB(child of ClassA), and also ClassA.

    //And this is how Hierarchial inheritance works.
}
