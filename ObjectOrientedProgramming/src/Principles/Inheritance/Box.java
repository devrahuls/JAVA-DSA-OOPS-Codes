package Principles.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    public Box(){
        l = 1;
        w = 1;
        h = 1;
    }

    //for cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double l, double h, double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;

    }

    public void information(){
        System.out.println("Hey you bitch!");
    }

}
