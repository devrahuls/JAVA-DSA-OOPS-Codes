package rahul.introduction;

public class CallingCunstructorInsideConstructor {
    public static void main(String[] args) {

        Student00 random = new Student00();

        System.out.println(random.roll);
        System.out.println(random.name);
        System.out.println(random.marks);

        int x = 8;
        int f = (int)Math.floor(Math.sqrt(x));
        System.out.println(f);


    }
}

class Student00{
    int roll;
    String name;
    float marks;

    Student00(){

        //this is how we call a constructor inside the constructor.
        //it basically checks all the constructor inside the class that follows the same argument passing, and then assign the value.
        //Internally: new Student00 (18, "Random", 99.9f);
        this(18, "Random", 99.9f);
    }

    Student00(int roll, String name, float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
