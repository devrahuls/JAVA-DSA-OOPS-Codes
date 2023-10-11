package Collections.enumExamples;

public class Basic {
    //enums means, fixed group of objects in a class.
    //Like, there have to be a constant number of objects, like, month in a year, day in a week. Here, years & weeks are classes. and,
    // months & days are objects (that is fixed).

    //enums can implements as many classes as you want, but cant extends.
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //These are enum constants.
        //Here, each element is Public, Static, and Final.
        //Since, it is final you cant create child enums.
        //All the element's type is Week.

        Week(){
            System.out.println("Constructor callled: " + this); //It will prints all the days of the week.
        }
        //The constructor isn't Public or Protected, only Private or Default.
        // WHY? -Because, if we declare Public or Protected, then we can create new objects, and thats not the enums concept are.
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(week);
        System.out.println(week.ordinal()); //Returns the position of the element.


        for (Week week1 : Week.values()){
            System.out.println(week1);
        }

    }
}
