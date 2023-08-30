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
    }

    class Student{
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
    }
}
