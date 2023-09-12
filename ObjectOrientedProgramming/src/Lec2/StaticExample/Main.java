package Lec2.StaticExample;

public class Main {

    //Here, static means, we can access the main method without creating an object of the 'Main' class. And, the main method
    // is the very first thing that executes when we run a java program.
    public static void main(String[] args) {

//        We can call human class and make a object of it from the Human class, because both(Human, & Main) classes are in same package.
        Human Rahul = new Human(21, "Rahul", 20000, false);
        Human Kunal = new Human(23, "Kunal", 50000, true);


        System.out.println(Human.population);//Returns the population value of the 'Human' class.

        //We can also get the same output, but the right convention is above one(line 12).
        System.out.println(Rahul.population);
        System.out.println(Kunal.population);
        //The population for the 'Rahul' and 'Kunal' object is same, and will be same for the every object made by the 'Human' class.
    }


    //It is static, means it doesn't depend on the objects.
    static void fun(){
        //greeting();//We can't use this because it depends on the objects/instances.
        //but the function in which you are using it, is not depend on the objects/instances.
        //To run greeting() method, it has to be static.

        //You cannot access non-static stuffs without referencing their instances
        // in a static context.

        //Hence, here I'm referencing it
        Main obj = new Main();
        obj.greeting();
    }

    //Something which is non-static, can access non-static stuff.
    void fun2(){
        greeting();
    }

    //It is non-static, and we know that something which is non-static means it depends on the objects.
     void greeting(){
        System.out.println("heyyy");
    }

//EITHER, YOU CREATE AN OBJECT FOR THE NON-STATIC STUFF IN ORDER TO ACCESS IT, ELSE MAKE IT STATIC.
}
