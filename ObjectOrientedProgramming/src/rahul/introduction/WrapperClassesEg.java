package rahul.introduction;

public class WrapperClassesEg {
    public static void main(String[] args) {
//        int a = 10; // Reference variable is a Primitive
//        Integer num = 45; // Reference variable is an Object

//        int a = 10; //It is not swapping because primitives are the pass by value, not pass by the reference.
//        int b = 20;

        Integer a = 10;// Since Wrapper classes can be pass by reference, but still it won't swap because the Integer is a final.
        Integer b = 20;
        swap(a , b);
        System.out.println(a + " " +b);


        final int x = 10;//final keyword is like const of java, it doesn't let the value to modified once it's been initialized.



        final A Rahul = new A("Rahul Saw");
        Rahul.name = "newName"; //We can re-assign the value of the instance variable
        //When a non-primitive is final you can't reassign it
        //Rahul = new A("newObject");// But can't assign a new object to this object.



        //Garbage Collector -
        //Garbage collector hits when the reference variable of the object doesn't exist.
        //If we want to perform something whenever any particular moment the garbage collector hits. So we can do with the help of finalize()
        //keyword.

        //Let's create an object and re-assign it's thousands of time.

        A obj;
        for (int i = 0; i < 1000000000; i++) {
            //So, at the very end all the previous value of the obj will be destroyed, since, they won't have any reference variable.
            obj = new A("new Object");
        }

    }

    static void swap(Integer a , Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class g{
//    final c; // It will give error because the final variable must be initialized.
}

class A{
    final int num = 10;
     String name;

     A(String name){
         this.name = name;
     }

    @Override
    protected void finalize() throws Throwable {
         //And, each time the previous value of the obj being destroyed by the garbage collector, it is going to print this statement.
        System.out.println("Object is being destroyed!!");
    }
}
