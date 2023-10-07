package generics.comparing;

public class Student implements Comparable<Student>{

    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o){
        int diff = (int)(this.marks - o.marks);

        // If diff == 0, means both are equal.
        // If diff < 0, means o is bigger.
        // If diff > 0, means o is smaller.

        return diff;
    }
}
