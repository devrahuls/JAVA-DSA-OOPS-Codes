package generics.comparing;

public class Main {

    public static void main(String[] args) {
        Student rahul = new Student(76, 99.78f);
        Student kunal = new Student(78, 98.23f);

        if( kunal.compareTo(rahul) < 0 ){

            System.out.println(kunal.compareTo(rahul));
            System.out.println("Rahul has more than kunal");
        }
    }
}
