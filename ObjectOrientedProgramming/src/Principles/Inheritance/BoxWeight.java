package Principles.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        weight = 1;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l, h, w); // It means, call the parent class constructor which has the property of l, h, & w, i.e., passing through the arguments.
        //Used to initialize the values that are present in the parent class. We cant access those constructors which are declared as Private.
        this.weight = weight;
    }
}
