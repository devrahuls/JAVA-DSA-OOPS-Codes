package Lec2.StaticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    //If we don't put static here then it will return 1, only that population that is specific to the particular object.
    //But if we put static here, then it will return 2, means this population which is inside the class is common to all the objects related to
    // the 'Human' class.

     Human(int age, String name, int salary, boolean married){

         this.age = age;
         this.name = name;
         this.salary = salary;
         this.married = married;

         //It first check -> does any object has population instance variable, if not, then it will check same for the class, and will return
         //or runs for all of the objects made by the 'Human' class.
//         this.population += 1;

         Human.population += 1;
         //Means, initiate the population variable of the 'Human' class, and add 1, everytime an object is initialsed via 'Human' class.
    }
}
