package CloningObjects;

public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

//    public Object clone() throws CloneNotSupportedException{
//
//        //Shallow copying
//        return super.clone();
//    }


    public Object clone() throws CloneNotSupportedException{

        //Deep copy - Instead of just referencing or pointing to the original object's non-primitives of the copied object. It creates a new copy of the original objects' non-primitives.
        Human twin = (Human) super.clone(); //this is actually a shallow copy

        //make a deep copy
        this.arr = new int[twin.arr.length]; //creating a new array copy
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}
