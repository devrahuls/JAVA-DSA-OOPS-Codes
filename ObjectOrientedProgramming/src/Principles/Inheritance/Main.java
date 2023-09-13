package Principles.Inheritance;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(3);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        Box box2 = new Box(box1);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
        System.out.println(box3.h + " " + box3.weight);
        System.out.println(box4.h + " " + box4.weight);


        Box box5 = new BoxWeight(1, 2, 3, 4);
        System.out.println(box5.l + " " + box5.w + " " + box5.h /* +" " + box5.weight*/); //Here, we can access the l,w,h but cant weight.
        //Because the type of the box5 is Box(parent class) and it is referencing to the BoxWeight(child class).
        //So, Parent class can be referenced to the Child class, but also cant access the Child instances.


        //There are many variables in both Parent and child classes.
//        You are given access to the variables that are in reference type i.e., BoxWeight
//        Hence, you should have access to the "weight" variable.
//        This also means, that ones you are trying to access should be initialised.
//        But here, when the obj itself is of the type of parent class, how will you call the constructor.
//        This is why it throws an error.
//        BoxWeight box6 = new Box(1, 2, 3); // It will throws error!

    }
}
