package Lec2.Packages.a;

//We are importing a 'message' method from the 'Message' class which is inside the b package i.e., a sub-folder/sub-package of the Packages
// folder/package.
import static Lec2.Packages.b.Message.message;

public class Greet {
    public static void main(String[] args) {
        System.out.println("Hey");
        message();
    }
}
