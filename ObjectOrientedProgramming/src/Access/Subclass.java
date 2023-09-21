package Access;

public class Subclass extends A{

    public Subclass(int num, String name){
        super(num, name);
    }



    public static void main(String[] args) {

        //Protected modifier can be accessed in the subclass of the same package.
        Subclass obj = new Subclass(60, "Trrr");
        int n = obj.num;

        //This will also work, it can directly access the protected variables, since it is in the same package. But, except this current package
        // no other package can access class 'A' directly.
//    A obj = new A(60, "Trrr");
//    int n = obj.num;

        //instanceof - used to check that the object is instance of the particular class or not.
        System.out.println(obj instanceof Subclass);
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Object);//since, every object is the instance of the Object class.

    }
}
