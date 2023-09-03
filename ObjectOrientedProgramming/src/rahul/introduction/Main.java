package rahul.introduction;

public class Main {
    public static void main(String[] args) {

        //Create a data type to store roll no of 5 students
        int[] roll = new int[5];

        //Create a data type to store Name of 5 students
        String[] names = new String[5];


        //Create a data type that stores Name, Roll, and Marks of the student
        //So, for that we have to create a custom data type, that can be created by creating a class.
        Student[] students = new Student[5];
        //This datatype let us to stores the roll, name, and marks of the 5 students.



        // A new Object named 'Rahul' is being created by using Student class
        Student Rahul;
        Rahul = new Student(99, "Rahul", 87.9f);


//        Rahul.rollno = 69;
//        Rahul.name = "Rahul";
//        Rahul.marks = 79.5f;
        //Suppose if we have 100 instance variable, so are we going to declare the object for each instance variable?? NO, Right!
        //So, what will going to do, is to use the constructor(i.e., reside inside the body of the class)
        //Constructor -> A constructor is nothing but a special function, that runs when you create an object, and it allocates some variables.

        Student Kunal = new Student();//Both prints the value of the Student() method inside the class.
        Student Kunal1 = new Student();//--^

        Student Aasya = new Student();

        System.out.println(Rahul); //It will give us a Random value
        System.out.println(Rahul.rollno);// It returns rollno vlaue of the Rahul object, or 0 if rollno isn't being initialised
        System.out.println(Rahul.name); //It returns name value of the Rahul object, or null if name isn't being initialised
        System.out.println(Rahul.marks); // It returns marks value of the Rahul object, or 0 if marks isn't being initialised

        System.out.println(Kunal);
        System.out.println(Kunal.rollno);
        System.out.println(Kunal.name);
        System.out.println(Kunal.marks);

        Kunal.Greeting(); //It will gonna have the name 'Rahul Saw' bcz it is being declared inside the constructor, which is present inside the class.

        Aasya.changeName("Aasya"); //It is going to change the instance-variable 'name' for the Aasya object.
        Aasya.Greeting(); //It won't greet with the value 'Rahul Saw' that is being declared in the constructor, instead 'Aasya' that is being passes to the
        //changeName argument, and then Greeting fn prints the greeting msg along with the this.name, means it has the name of the particular object value,
        //not that is being declared in the Student() fn.


        Student random1 = new Student(Rahul);
        System.out.println(random1.name); //It will return the name of the Rahul object 'cause it is passing the Rahul object as an argument to the
        // Student(Student other) constructor.

        Student random2 = new Student();
        System.out.println(random2.name);



        //Refrencing one object to another
        Student one = new Student();
        Student two = one;
        one.name = "Let them sink in";
        System.out.println(two.name); //prints - Let them sink in
    }
}

//Creating a class
//for every single student
class Student{
    int rollno;
    String name;
    float marks;


    //It will going to greet with the msg along with the object's instance variable 'name' value.
    void Greeting(){
        System.out.println("Hello, my name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }
    Student(){
        this.rollno = 69; //this keyword is referred to the constructor's ( i.e., Student() ) particular object's (i.e., Rahul) value. So jaha-jaha v
        // Student() constructor call/use hoga, to uska jo object hoga, uska value ye this.roll, this.name etc hold krega.
        this.name = "Rahul Saw";
        this.marks = 79.6f;
    }




    Student(int roll, String name, float marks){
        this.rollno = roll;
        this.name = name;
        this.marks = marks;
    }

    //Passing constructor as an argument
    Student(Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }




}
