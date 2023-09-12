package Lec2.StaticExample;

//'InnerClasses' class can't be static because outer classes can't be static.
public class InnerClasses {

    //It has to be either static because it depends on the 'InnerClasses' class.
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    //Method and inner classes can have instances of each other, that's why here static class can be accessed by an objects.
    public static void main(String[] args) {
        Test a = new Test("Rahul");
        Test b = new Test("Kunal");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
