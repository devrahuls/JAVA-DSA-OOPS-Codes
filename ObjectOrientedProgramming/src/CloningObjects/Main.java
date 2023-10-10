package CloningObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        Human rahul = new Human(22, "Rahul");
//        Human twin = new Human(rahul); //This is how we used to clone an object.

        Human twin = (Human) rahul.clone(); //This is the new method to copy/cloning the object.
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(rahul.arr)); //Due to shallow copying the change in "twin" object also make the changes in 'rahul' object. Not in the case of
        // Primitives, works only for Non - Primitives.

    }
}
